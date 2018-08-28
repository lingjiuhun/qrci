package com.share.inspect.qrci.enter;

public class PowerSupplyBureau {
    /**
     * 主键
     */
    private Long id;

    /**
     * 名称
     */
    private String bureauName;

    /**
     * 地址
     */
    private String address;

    /**
     * 联系电话
     */
    private String telphone;

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
     * @return bureau_name 名称
     */
    public String getBureauName() {
        return bureauName;
    }

    /**
     * 名称
     *
     * @param bureauName 名称
     */
    public void setBureauName(String bureauName) {
        this.bureauName = bureauName == null ? null : bureauName.trim();
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
