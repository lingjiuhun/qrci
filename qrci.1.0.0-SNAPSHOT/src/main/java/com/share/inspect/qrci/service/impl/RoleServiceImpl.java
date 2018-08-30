package com.share.inspect.qrci.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;
import java.util.Map;
import java.util.Objects;


import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.share.inspect.qrci.enter.Role;
import com.share.inspect.qrci.dao.mapper.RoleMapper;
import com.share.inspect.qrci.service.IRoleService;

/**
* @Author:
* @Description: 服务实现
* @date:
*/
@Log4j2
@Service
public class RoleServiceImpl implements IRoleService {
@Autowired
private RoleMapper roleMapper;


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
@Override
public PageInfo<Role> selectByPage(Map
<String, Object> param, Integer page, Integer pageSize) throws Exception {
int limit = pageSize != null ? pageSize : 10;
int offset = (page != null ? page : 1);
PageHelper.startPage(offset, limit);

List<Role> datas = roleMapper.selectByPropertyByPage(param);

PageInfo<Role> pageInfo = new PageInfo<>(datas);
return pageInfo;
}


/**
* 新增
*
* @param role
* @Author:
* @return: java.lang.Integer
* @exception:
* @date: 2018-8-29 20:54:26
*/
@Override
public Integer insert(Role role) throws Exception {
Integer r = 0;
//数据非空判断
if (Objects.isNull(role)
) {
return r = -1;
}

//默认数据处理

//数据入库
r = roleMapper.insertSelective(role);

return r;
}


/**
* 根据主键更新
*
* @param role
* @Author:
* @return: java.lang.Integer
* @exception:
* @date: 2018-8-29 20:54:26
*/
@Override
public Integer updateById(Role role) throws Exception {
Integer r = 0;
//主键存在判断
if (role == null || role.getRoleId() == null) {
return r = -1;
}
//唯一性判断

//数据更新
r = roleMapper.updateByPrimaryKeySelective(role);

return r;
}


/**
* 根据主键删除
*
* @param roleId
* @Author:
* @return: int
* @exception:
* @date: 2018-8-29 20:54:26
*/
@Override
public int deleteById(Long roleId) throws Exception {
int r = 0;
//roleId非空判断
if (roleId == null || roleId == 0) {
return -1;
}
//数据删除
r = roleMapper.deleteByPrimaryKey(roleId);

return r;
}


/**
* 根据主键批量删除
*
* @param roleIds
* @Author:
* @return: int
* @exception:
* @date: 2018-8-29 20:54:26
*/
public Integer deleteBatchByIds(List roleIds) throws Exception{
int result = -1;

//roleIds非空判断
if (roleIds == null || roleIds.size() <= 0) {
return -1;
}
result = roleMapper.deleteBatchByPrimaryKey(roleIds);

return result;
}


/**
* 根据主键查询
*
* @param roleId
* @Author:
* @return: com.share.inspect.qrci.enter.Role
* @exception:
* @date: 2018-8-29 20:54:26
*/
public Role selectById(Long roleId) throws Exception {
Role role = null;
//id非空判断
if (roleId != null || roleId > 0) {
role = roleMapper.selectByPrimaryKey(roleId);
}
return role;
}


}