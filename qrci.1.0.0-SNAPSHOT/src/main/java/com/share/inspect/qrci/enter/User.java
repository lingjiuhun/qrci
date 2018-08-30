package com.share.inspect.qrci.enter;

import java.util.Date;

public class User {
/**
* 用户主键
*/
private String userId;

/**
* 用户名
*/
private String userName;

/**
* 密码
*/
private String password;

/**
* 真实名称
*/
private String realName;

/**
* 部门
*/
private Long departmentId;

/**
* 员工编号
*/
private String userNumber;

/**
* 电话
*/
private String phone;

/**
* 邮箱
*/
private String email;

/**
* 创建时间
*/
private Date createTime;

/**
* 逻辑删除标志(0:未删除1：已删除)
*/
private Integer delFlag;

/**
* 是否部门领导（0：不是 1：是）
*/
private Integer departmentLeader;

/**
* 是否分管领导（0：不是 1：是）
*/
private Integer chargeLeader;

/**
* 职位（安监）
*/
private String userPosition;

/**
* 创建者Id
*/
private Long createUserId;

/**
* 更新时间
*/
private Long updateTime;

/**
* 用户主键
* @return user_id 用户主键
*/
public String getUserId() {
return userId;
}

/**
* 用户主键
* @param userId 用户主键
*/
public void setUserId(String userId) {
this.userId = userId == null ? null : userId.trim();
}

/**
* 用户名
* @return user_name 用户名
*/
public String getUserName() {
return userName;
}

/**
* 用户名
* @param userName 用户名
*/
public void setUserName(String userName) {
this.userName = userName == null ? null : userName.trim();
}

/**
* 密码
* @return password 密码
*/
public String getPassword() {
return password;
}

/**
* 密码
* @param password 密码
*/
public void setPassword(String password) {
this.password = password == null ? null : password.trim();
}

/**
* 真实名称
* @return real_name 真实名称
*/
public String getRealName() {
return realName;
}

/**
* 真实名称
* @param realName 真实名称
*/
public void setRealName(String realName) {
this.realName = realName == null ? null : realName.trim();
}

/**
* 部门
* @return department_id 部门
*/
public Long getDepartmentId() {
return departmentId;
}

/**
* 部门
* @param departmentId 部门
*/
public void setDepartmentId(Long departmentId) {
this.departmentId = departmentId;
}

/**
* 员工编号
* @return user_number 员工编号
*/
public String getUserNumber() {
return userNumber;
}

/**
* 员工编号
* @param userNumber 员工编号
*/
public void setUserNumber(String userNumber) {
this.userNumber = userNumber == null ? null : userNumber.trim();
}

/**
* 电话
* @return phone 电话
*/
public String getPhone() {
return phone;
}

/**
* 电话
* @param phone 电话
*/
public void setPhone(String phone) {
this.phone = phone == null ? null : phone.trim();
}

/**
* 邮箱
* @return email 邮箱
*/
public String getEmail() {
return email;
}

/**
* 邮箱
* @param email 邮箱
*/
public void setEmail(String email) {
this.email = email == null ? null : email.trim();
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
* 逻辑删除标志(0:未删除1：已删除)
* @return del_flag 逻辑删除标志(0:未删除1：已删除)
*/
public Integer getDelFlag() {
return delFlag;
}

/**
* 逻辑删除标志(0:未删除1：已删除)
* @param delFlag 逻辑删除标志(0:未删除1：已删除)
*/
public void setDelFlag(Integer delFlag) {
this.delFlag = delFlag;
}

/**
* 是否部门领导（0：不是 1：是）
* @return department_leader 是否部门领导（0：不是 1：是）
*/
public Integer getDepartmentLeader() {
return departmentLeader;
}

/**
* 是否部门领导（0：不是 1：是）
* @param departmentLeader 是否部门领导（0：不是 1：是）
*/
public void setDepartmentLeader(Integer departmentLeader) {
this.departmentLeader = departmentLeader;
}

/**
* 是否分管领导（0：不是 1：是）
* @return charge_leader 是否分管领导（0：不是 1：是）
*/
public Integer getChargeLeader() {
return chargeLeader;
}

/**
* 是否分管领导（0：不是 1：是）
* @param chargeLeader 是否分管领导（0：不是 1：是）
*/
public void setChargeLeader(Integer chargeLeader) {
this.chargeLeader = chargeLeader;
}

/**
* 职位（安监）
* @return user_position 职位（安监）
*/
public String getUserPosition() {
return userPosition;
}

/**
* 职位（安监）
* @param userPosition 职位（安监）
*/
public void setUserPosition(String userPosition) {
this.userPosition = userPosition == null ? null : userPosition.trim();
}

/**
* 创建者Id
* @return create_user_id 创建者Id
*/
public Long getCreateUserId() {
return createUserId;
}

/**
* 创建者Id
* @param createUserId 创建者Id
*/
public void setCreateUserId(Long createUserId) {
this.createUserId = createUserId;
}

/**
* 更新时间
* @return update_time 更新时间
*/
public Long getUpdateTime() {
return updateTime;
}

/**
* 更新时间
* @param updateTime 更新时间
*/
public void setUpdateTime(Long updateTime) {
this.updateTime = updateTime;
}
}
