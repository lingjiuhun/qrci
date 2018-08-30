package com.share.inspect.qrci.service;

import java.util.List;
import java.util.Map;
import com.github.pagehelper.PageInfo;

import com.share.inspect.qrci.enter.Role;

/**
* @Author:
* @Description: 服务接口
* @date: 2018-8-29 20:54:26
*/
public interface IRoleService {

/**
* 根据参数分页查询
*
* @param param
* @param page
* @param pageSize
* @Author:
* @return: com.github.pagehelper.PageInfo<com.share.inspect.qrci.enter.Role>
* @exception:
* @date: 2018-8-29 20:54:26
*/
PageInfo<Role> selectByPage(Map
<String, Object> param, Integer page, Integer pageSize) throws Exception;


/**
* 新增
*
* @param role
* @Author:
* @return: java.lang.Integer
* @exception:
* @date: 2018-8-29 20:54:26
*/
Integer insert(Role role) throws Exception;


/**
* 根据主键更新
*
* @param role
* @Author:
* @return: java.lang.Integer
* @exception:
* @date: 2018-8-29 20:54:26
*/
Integer updateById(Role role) throws Exception;

/**
* 根据主键删除
*
* @param roleId
* @Author:
* @return: int
* @exception:
* @date: 2018-8-29 20:54:26
*/
int deleteById(Long roleId) throws Exception;

/**
* 根据主键批量删除
*
* @param roleIds
* @Author:
* @return: int
* @exception:
* @date: 2018-8-29 20:54:26
*/
Integer deleteBatchByIds(List roleIds) throws Exception;


/**
* 根据主键查询
*
* @param roleId
* @Author:
* @return: com.share.inspect.qrci.enter.Role
* @exception:
* @date: 2018-8-29 20:54:26
*/
Role selectById(Long roleId) throws Exception;


}