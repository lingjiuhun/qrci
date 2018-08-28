package com.share.inspect.qrci.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.share.inspect.qrci.dao.mapper.ProjectMapper;
import com.share.inspect.qrci.enter.Project;
import com.share.inspect.qrci.service.IProjectService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @Author:
 * @Description: 服务实现
 * @date:
 */
@Log4j2
@Service
public class ProjectServiceImpl implements IProjectService {
    @Autowired
    private ProjectMapper projectMapper;


    /**
     * 根据参数分页查询
     *
     * @param param
     * @param page
     * @param pageSize
     * @Author:
     * @return: com.github.pagehelper.PageInfo<com.share.inspect.qrci.enter.Project>
     * @exception:
     * @date: 2018-8-28 22:11:41
     */
    @Override
    public PageInfo<Project> selectByPage(Map
                                                  <String, Object> param, Integer page, Integer pageSize) throws Exception {
        int limit = pageSize != null ? pageSize : 10;
        int offset = (page != null ? page : 1);
        PageHelper.startPage(offset, limit);

        List<Project> datas = projectMapper.selectByPropertyByPage(param);

        PageInfo<Project> pageInfo = new PageInfo<>(datas);
        return pageInfo;
    }


    /**
     * 新增
     *
     * @param project
     * @Author:
     * @return: java.lang.Integer
     * @exception:
     * @date: 2018-8-28 22:11:41
     */
    @Override
    public Integer insert(Project project) throws Exception {
        Integer r = 0;
//数据非空判断
        if (Objects.isNull(project)
                ) {
            return r = -1;
        }

//默认数据处理

//数据入库
        r = projectMapper.insertSelective(project);

        return r;
    }


    /**
     * 根据主键更新
     *
     * @param project
     * @Author:
     * @return: java.lang.Integer
     * @exception:
     * @date: 2018-8-28 22:11:41
     */
    @Override
    public Integer updateById(Project project) throws Exception {
        Integer r = 0;
//主键存在判断
        if (project == null || project.getId() == null) {
            return r = -1;
        }
//唯一性判断

//数据更新
        r = projectMapper.updateByPrimaryKeySelective(project);

        return r;
    }


    /**
     * 根据主键删除
     *
     * @param id
     * @Author:
     * @return: int
     * @exception:
     * @date: 2018-8-28 22:11:41
     */
    @Override
    public int deleteById(Long id) throws Exception {
        int r = 0;
//id非空判断
        if (id == null || id == 0) {
            return -1;
        }
//数据删除
        r = projectMapper.deleteByPrimaryKey(id);

        return r;
    }


    /**
     * 根据主键批量删除
     *
     * @param ids
     * @Author:
     * @return: int
     * @exception:
     * @date: 2018-8-28 22:11:41
     */
    public Integer deleteBatchByIds(List ids) throws Exception {
        int result = -1;

//ids非空判断
        if (ids == null || ids.size() <= 0) {
            return -1;
        }
        result = projectMapper.deleteBatchByPrimaryKey(ids);

        return result;
    }


    /**
     * 根据主键查询
     *
     * @param id
     * @Author:
     * @return: com.share.inspect.qrci.enter.Project
     * @exception:
     * @date: 2018-8-28 22:11:41
     */
    public Project selectById(Long id) throws Exception {
        Project project = null;
//id非空判断
        if (id != null || id > 0) {
            project = projectMapper.selectByPrimaryKey(id);
        }
        return project;
    }


}