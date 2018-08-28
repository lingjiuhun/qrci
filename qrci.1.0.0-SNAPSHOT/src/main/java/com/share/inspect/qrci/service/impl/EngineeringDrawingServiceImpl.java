package com.share.inspect.qrci.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.share.inspect.qrci.dao.mapper.EngineeringDrawingMapper;
import com.share.inspect.qrci.enter.EngineeringDrawing;
import com.share.inspect.qrci.service.IEngineeringDrawingService;
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
public class EngineeringDrawingServiceImpl implements IEngineeringDrawingService {
    @Autowired
    private EngineeringDrawingMapper engineeringDrawingMapper;


    /**
     * 根据参数分页查询
     *
     * @param param
     * @param page
     * @param pageSize
     * @Author:
     * @return: com.github.pagehelper.PageInfo<com.share.inspect.qrci.enter.EngineeringDrawing>
     * @exception:
     * @date: 2018-8-28 21:49:23
     */
    @Override
    public PageInfo<EngineeringDrawing> selectByPage(Map
                                                             <String, Object> param, Integer page, Integer pageSize) throws Exception {
        int limit = pageSize != null ? pageSize : 10;
        int offset = (page != null ? page : 1);
        PageHelper.startPage(offset, limit);

        List<EngineeringDrawing> datas = engineeringDrawingMapper.selectByPropertyByPage(param);

        PageInfo<EngineeringDrawing> pageInfo = new PageInfo<>(datas);
        return pageInfo;
    }


    /**
     * 新增
     *
     * @param engineeringDrawing
     * @Author:
     * @return: java.lang.Integer
     * @exception:
     * @date: 2018-8-28 21:49:23
     */
    @Override
    public Integer insert(EngineeringDrawing engineeringDrawing) throws Exception {
        Integer r = 0;
//数据非空判断
        if (Objects.isNull(engineeringDrawing)
                ) {
            return r = -1;
        }

//默认数据处理

//数据入库
        r = engineeringDrawingMapper.insertSelective(engineeringDrawing);

        return r;
    }


    /**
     * 根据主键更新
     *
     * @param engineeringDrawing
     * @Author:
     * @return: java.lang.Integer
     * @exception:
     * @date: 2018-8-28 21:49:23
     */
    @Override
    public Integer updateById(EngineeringDrawing engineeringDrawing) throws Exception {
        Integer r = 0;
//主键存在判断
        if (engineeringDrawing == null || engineeringDrawing.getId() == null) {
            return r = -1;
        }
//唯一性判断

//数据更新
        r = engineeringDrawingMapper.updateByPrimaryKeySelective(engineeringDrawing);

        return r;
    }


    /**
     * 根据主键删除
     *
     * @param id
     * @Author:
     * @return: int
     * @exception:
     * @date: 2018-8-28 21:49:23
     */
    @Override
    public int deleteById(Long id) throws Exception {
        int r = 0;
//id非空判断
        if (id == null || id == 0) {
            return -1;
        }
//数据删除
        r = engineeringDrawingMapper.deleteByPrimaryKey(id);

        return r;
    }


    /**
     * 根据主键批量删除
     *
     * @param ids
     * @Author:
     * @return: int
     * @exception:
     * @date: 2018-8-28 21:49:23
     */
    public Integer deleteBatchByIds(List ids) throws Exception {
        int result = -1;

//ids非空判断
        if (ids == null || ids.size() <= 0) {
            return -1;
        }
        result = engineeringDrawingMapper.deleteBatchByPrimaryKey(ids);

        return result;
    }


    /**
     * 根据主键查询
     *
     * @param id
     * @Author:
     * @return: com.share.inspect.qrci.enter.EngineeringDrawing
     * @exception:
     * @date: 2018-8-28 21:49:23
     */
    public EngineeringDrawing selectById(Long id) throws Exception {
        EngineeringDrawing engineeringDrawing = null;
//id非空判断
        if (id != null || id > 0) {
            engineeringDrawing = engineeringDrawingMapper.selectByPrimaryKey(id);
        }
        return engineeringDrawing;
    }


}