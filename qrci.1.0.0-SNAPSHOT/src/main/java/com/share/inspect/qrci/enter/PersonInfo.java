package com.share.inspect.qrci.enter;

public class PersonInfo {
    /**
     * 主键
     */
    private Long id;

    /**
     * 名称
     */
    private String personName;

    /**
     * 联系电话
     */
    private String telphone;

    /**
     * 所属机构(班组，部门)
     */
    private Long partId;

    /**
     * 机构类型(班组，部门)
     */
    private Integer partType;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * 所属供电所
     */
    private Long unilityId;

    /**
     * 邮箱
     */
    private String personEmail;

    /**
     * 备注
     */
    private String comment;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 更新时间
     */
    private Long updateTime;

    /**
     * 是否冻结
     */
    private Integer isEnable;

    /**
     * 主键
     *
     * @return id 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 名称
     *
     * @return person_name 名称
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * 名称
     *
     * @param personName 名称
     */
    public void setPersonName(String personName) {
        this.personName = personName == null ? null : personName.trim();
    }

    /**
     * 联系电话
     *
     * @return telphone 联系电话
     */
    public String getTelphone() {
        return telphone;
    }

    /**
     * 联系电话
     *
     * @param telphone 联系电话
     */
    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    /**
     * 所属机构(班组，部门)
     *
     * @return part_id 所属机构(班组，部门)
     */
    public Long getPartId() {
        return partId;
    }

    /**
     * 所属机构(班组，部门)
     *
     * @param partId 所属机构(班组，部门)
     */
    public void setPartId(Long partId) {
        this.partId = partId;
    }

    /**
     * 机构类型(班组，部门)
     *
     * @return part_type 机构类型(班组，部门)
     */
    public Integer getPartType() {
        return partType;
    }

    /**
     * 机构类型(班组，部门)
     *
     * @param partType 机构类型(班组，部门)
     */
    public void setPartType(Integer partType) {
        this.partType = partType;
    }

    /**
     * 用户名
     *
     * @return user_name 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 密码
     *
     * @return user_password 密码
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 密码
     *
     * @param userPassword 密码
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * 所属供电所
     *
     * @return unility_id 所属供电所
     */
    public Long getUnilityId() {
        return unilityId;
    }

    /**
     * 所属供电所
     *
     * @param unilityId 所属供电所
     */
    public void setUnilityId(Long unilityId) {
        this.unilityId = unilityId;
    }

    /**
     * 邮箱
     *
     * @return person_email 邮箱
     */
    public String getPersonEmail() {
        return personEmail;
    }

    /**
     * 邮箱
     *
     * @param personEmail 邮箱
     */
    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail == null ? null : personEmail.trim();
    }

    /**
     * 备注
     *
     * @return comment 备注
     */
    public String getComment() {
        return comment;
    }

    /**
     * 备注
     *
     * @param comment 备注
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     * 创建时间
     *
     * @return create_time 创建时间
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     *
     * @return update_time 更新时间
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 是否冻结
     *
     * @return is_enable 是否冻结
     */
    public Integer getIsEnable() {
        return isEnable;
    }

    /**
     * 是否冻结
     *
     * @param isEnable 是否冻结
     */
    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }
}
