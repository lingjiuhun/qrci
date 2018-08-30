package com.share.inspect.qrci.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;

import com.share.inspect.qrci.enter.Role;

/**
* @Author:
* @Description: mapper接口
* @date: 2018-8-29 20:54:26
*/
@Component
@Mapper
public interface RoleMapper {


/**
* 根据主键查询
*
* @param id
* @Author:
* @return: com.share.inspect.qrci.enter.Role
* @exception:
* @date: 2018-8-29 20:54:26
*/
Role selectByPrimaryKey(Long roleId);

/**
* 根据主键删除
*
* @param id
* @Author:
* @return: int
* @exception:
* @date: 2018-8-29 20:54:26
*/
int deleteByPrimaryKey(Long roleId);

/**
* 根据主键批量删除
*
* @param list
* @Author:
* @return: int
* @exception:
* @date: 2018-8-29 20:54:26
*/
int deleteBatchByPrimaryKey(List
<String> list);


    /**
    * 新增
    *
    * @param record
    * @Author:
    * @return: int
    * @exception:
    * @date: 2018-8-29 20:54:26
    */
    int insertSelective(Role record);

    /**
    * 根据属性分页查询
    *
    * @param map
    * @Author:
    * @return: java.util.List<com.share.inspect.qrci.enter.Role>
    * @exception:
    * @date: 2018-8-29 20:54:26
    */
    List<Role> selectByPropertyByPage(Map map);

    /**
    * 根据属性查询记录数
    *
    * @param map
    * @Author:
    * @return: int
    * @exception:
    * @date: 2018-8-29 20:54:26
    */
    int selectCountByProperty(Map map);

    /**
    * 根据主键更新记录
    *
    * @param record
    * @Author:
    * @return: int
    * @exception:
    * @date: 2018-8-29 20:54:26
    */
    int updateByPrimaryKeySelective(Role record);

    }