package com.share.inspect.qrci.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;
import java.util.Map;
import java.util.Objects;


import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.share.inspect.qrci.enter.User;
import com.share.inspect.qrci.dao.mapper.UserMapper;
import com.share.inspect.qrci.service.IUserService;

/**
* @Author:
* @Description: 服务实现
* @date:
*/
@Log4j2
@Service
public class UserServiceImpl implements IUserService {
@Autowired
private UserMapper userMapper;


/**
* 根据参数分页查询
*
* @param param
* @param page
* @param pageSize
* @Author:
* @return: com.github.pagehelper.PageInfo<com.share.inspect.qrci.enter.User>
* @exception:
* @date: 2018-8-29 20:37:15
*/
@Override
public PageInfo<User> selectByPage(Map
<String, Object> param, Integer page, Integer pageSize) throws Exception {
int limit = pageSize != null ? pageSize : 10;
int offset = (page != null ? page : 1);
PageHelper.startPage(offset, limit);

List<User> datas = userMapper.selectByPropertyByPage(param);

PageInfo<User> pageInfo = new PageInfo<>(datas);
return pageInfo;
}


/**
* 新增
*
* @param user
* @Author:
* @return: java.lang.Integer
* @exception:
* @date: 2018-8-29 20:37:15
*/
@Override
public Integer insert(User user) throws Exception {
Integer r = 0;
//数据非空判断
if (Objects.isNull(user)
) {
return r = -1;
}

//默认数据处理

//数据入库
r = userMapper.insertSelective(user);

return r;
}


/**
* 根据主键更新
*
* @param user
* @Author:
* @return: java.lang.Integer
* @exception:
* @date: 2018-8-29 20:37:15
*/
@Override
public Integer updateById(User user) throws Exception {
Integer r = 0;
//主键存在判断
if (user == null || user.getUserId() == null) {
return r = -1;
}
//唯一性判断

//数据更新
r = userMapper.updateByPrimaryKeySelective(user);

return r;
}


/**
* 根据主键删除
*
* @param userId
* @Author:
* @return: int
* @exception:
* @date: 2018-8-29 20:37:15
*/
@Override
public int deleteById(Long userId) throws Exception {
int r = 0;
//userId非空判断
if (userId == null || userId == 0) {
return -1;
}
//数据删除
r = userMapper.deleteByPrimaryKey(userId);

return r;
}


/**
* 根据主键批量删除
*
* @param userIds
* @Author:
* @return: int
* @exception:
* @date: 2018-8-29 20:37:15
*/
public Integer deleteBatchByIds(List userIds) throws Exception{
int result = -1;

//userIds非空判断
if (userIds == null || userIds.size() <= 0) {
return -1;
}
result = userMapper.deleteBatchByPrimaryKey(userIds);

return result;
}


/**
* 根据主键查询
*
* @param userId
* @Author:
* @return: com.share.inspect.qrci.enter.User
* @exception:
* @date: 2018-8-29 20:37:15
*/
public User selectById(Long userId) throws Exception {
User user = null;
//id非空判断
if (userId != null || userId > 0) {
user = userMapper.selectByPrimaryKey(userId);
}
return user;
}


}