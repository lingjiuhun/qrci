package com.share.inspect.qrci.enter;

public class PowerSupplyUtility {
    /**
     * 主键
     */
    private Long id;

    /**
     * 名称
     */
    private String utilityName;

    /**
     * 地址
     */
    private String address;

    /**
     * 所属供电局(主键)
     */
    private Long bureauId;

    /**
     * 联系电话
     */
    private String utilityPhone;

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
     * @return utility_name 名称
     */
    public String getUtilityName() {
        return utilityName;
    }

    /**
     * 名称
     *
     * @param utilityName 名称
     */
    public void setUtilityName(String utilityName) {
        this.utilityName = utilityName == null ? null : utilityName.trim();
    }

    /**
     * 地址
     *
     * @return address 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 所属供电局(主键)
     *
     * @return bureau_id 所属供电局(主键)
     */
    public Long getBureauId() {
        return bureauId;
    }

    /**
     * 所属供电局(主键)
     *
     * @param bureauId 所属供电局(主键)
     */
    public void setBureauId(Long bureauId) {
        this.bureauId = bureauId;
    }

    /**
     * 联系电话
     *
     * @return utility_phone 联系电话
     */
    public String getUtilityPhone() {
        return utilityPhone;
    }

    /**
     * 联系电话
     *
     * @param utilityPhone 联系电话
     */
    public void setUtilityPhone(String utilityPhone) {
        this.utilityPhone = utilityPhone == null ? null : utilityPhone.trim();
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
