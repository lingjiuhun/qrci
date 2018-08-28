package com.share.inspect.qrci.enter;

public class TeamGroup {
    /**
     * 主键
     */
    private Long id;

    /**
     * 名称
     */
    private String groupName;

    /**
     * 所属部门(主键)
     */
    private Long unitId;

    /**
     * 联系电话
     */
    private String groupPhone;

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
     * @return group_name 名称
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * 名称
     *
     * @param groupName 名称
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * 所属部门(主键)
     *
     * @return unit_id 所属部门(主键)
     */
    public Long getUnitId() {
        return unitId;
    }

    /**
     * 所属部门(主键)
     *
     * @param unitId 所属部门(主键)
     */
    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    /**
     * 联系电话
     *
     * @return group_phone 联系电话
     */
    public String getGroupPhone() {
        return groupPhone;
    }

    /**
     * 联系电话
     *
     * @param groupPhone 联系电话
     */
    public void setGroupPhone(String groupPhone) {
        this.groupPhone = groupPhone == null ? null : groupPhone.trim();
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
}
