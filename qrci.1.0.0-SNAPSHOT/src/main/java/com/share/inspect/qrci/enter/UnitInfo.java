package com.share.inspect.qrci.enter;

public class UnitInfo {
    /**
     * 主键
     */
    private Long id;

    /**
     * 名称
     */
    private String unitName;

    /**
     * 所属供电局
     */
    private Long bureauId;

    /**
     * 联系电话
     */
    private String unitPhone;

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
     * @return unit_name 名称
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * 名称
     *
     * @param unitName 名称
     */
    public void setUnitName(String unitName) {
        this.unitName = unitName == null ? null : unitName.trim();
    }

    /**
     * 所属供电局
     *
     * @return bureau_id 所属供电局
     */
    public Long getBureauId() {
        return bureauId;
    }

    /**
     * 所属供电局
     *
     * @param bureauId 所属供电局
     */
    public void setBureauId(Long bureauId) {
        this.bureauId = bureauId;
    }

    /**
     * 联系电话
     *
     * @return unit_phone 联系电话
     */
    public String getUnitPhone() {
        return unitPhone;
    }

    /**
     * 联系电话
     *
     * @param unitPhone 联系电话
     */
    public void setUnitPhone(String unitPhone) {
        this.unitPhone = unitPhone == null ? null : unitPhone.trim();
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
