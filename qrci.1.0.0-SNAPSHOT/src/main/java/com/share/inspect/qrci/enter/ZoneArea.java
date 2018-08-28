package com.share.inspect.qrci.enter;

public class ZoneArea {
    /**
     * 主键
     */
    private Long id;

    /**
     * 名称
     */
    private String zoneName;

    /**
     * 位置
     */
    private String address;

    /**
     * 所属线路(主键)
     */
    private Long lineId;

    /**
     * 所属供电所(主键)
     */
    private Long unilityId;

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
     * @return zone_name 名称
     */
    public String getZoneName() {
        return zoneName;
    }

    /**
     * 名称
     *
     * @param zoneName 名称
     */
    public void setZoneName(String zoneName) {
        this.zoneName = zoneName == null ? null : zoneName.trim();
    }

    /**
     * 位置
     *
     * @return address 位置
     */
    public String getAddress() {
        return address;
    }

    /**
     * 位置
     *
     * @param address 位置
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 所属线路(主键)
     *
     * @return line_id 所属线路(主键)
     */
    public Long getLineId() {
        return lineId;
    }

    /**
     * 所属线路(主键)
     *
     * @param lineId 所属线路(主键)
     */
    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    /**
     * 所属供电所(主键)
     *
     * @return unility_id 所属供电所(主键)
     */
    public Long getUnilityId() {
        return unilityId;
    }

    /**
     * 所属供电所(主键)
     *
     * @param unilityId 所属供电所(主键)
     */
    public void setUnilityId(Long unilityId) {
        this.unilityId = unilityId;
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
