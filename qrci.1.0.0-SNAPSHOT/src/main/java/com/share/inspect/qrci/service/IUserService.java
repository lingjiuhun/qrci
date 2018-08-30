package com.share.inspect.qrci.service;

import java.util.List;
import java.util.Map;
import com.github.pagehelper.PageInfo;

import com.share.inspect.qrci.enter.User;

/**
* @Author:
* @Description: 服务接口
* @date: 2018-8-30 18:54:44
*/
public interface IUserService {

/**
* 根据参数分页查询
*
* @param param
* @param page
* @param pageSize
* @Author:
* @return: com.github.pagehelper.PageInfo<com.share.inspect.qrci.enter.User>
* @exception:
* @date: 2018-8-30 18:54:44
*/
PageInfo<User> selectByPage(Map
<String, Object> param, Integer page, Integer pageSize) throws Exception;


/**
* 新增
*
* @param user
* @Author:
* @return: java.lang.Integer
* @exception:
* @date: 2018-8-30 18:54:44
*/
Integer insert(User user) throws Exception;


/**
* 根据主键更新
*
* @param user
* @Author:
* @return: java.lang.Integer
* @exception:
* @date: 2018-8-30 18:54:44
*/
Integer updateById(User user) throws Exception;

/**
* 根据主键删除
*
* @param userId
* @Author:
* @return: int
* @exception:
* @date: 2018-8-30 18:54:44
*/
int deleteById(String userId) throws Exception;

/**
* 根据主键批量删除
*
* @param userIds
* @Author:
* @return: int
* @exception:
* @date: 2018-8-30 18:54:44
*/
Integer deleteBatchByIds(List userIds) throws Exception;


/**
* 根据主键查询
*
* @param userId
* @Author:
* @return: com.share.inspect.qrci.enter.User
* @exception:
* @date: 2018-8-30 18:54:44
*/
User selectById(String userId) throws Exception;


}