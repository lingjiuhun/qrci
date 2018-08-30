package com.share.inspect.qrci.enter;

import java.util.Date;

public class Role {
/**
* 主键
*/
private Long roleId;

/**
* 角色名称
*/
private String roleName;

/**
* 备注
*/
private String common;

/**
* 创建时间
*/
private Date createTime;

/**
* 创建用户id
*/
private Long createUserid;

/**
* 主键
* @return role_id 主键
*/
public Long getRoleId() {
return roleId;
}

/**
* 主键
* @param roleId 主键
*/
public void setRoleId(Long roleId) {
this.roleId = roleId;
}

/**
* 角色名称
* @return role_name 角色名称
*/
public String getRoleName() {
return roleName;
}

/**
* 角色名称
* @param roleName 角色名称
*/
public void setRoleName(String roleName) {
this.roleName = roleName == null ? null : roleName.trim();
}

/**
* 备注
* @return common 备注
*/
public String getCommon() {
return common;
}

/**
* 备注
* @param common 备注
*/
public void setCommon(String common) {
this.common = common == null ? null : common.trim();
}

/**
* 创建时间
* @return create_time 创建时间
*/
public Date getCreateTime() {
return createTime;
}

/**
* 创建时间
* @param createTime 创建时间
*/
public void setCreateTime(Date createTime) {
this.createTime = createTime;
}

/**
* 创建用户id
* @return create_userid 创建用户id
*/
public Long getCreateUserid() {
return createUserid;
}

/**
* 创建用户id
* @param createUserid 创建用户id
*/
public void setCreateUserid(Long createUserid) {
this.createUserid = createUserid;
}
}
