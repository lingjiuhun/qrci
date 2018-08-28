package com.share.inspect.qrci.enter;

public class Device {
    /**
     * 主键
     */
    private Long id;

    /**
     * 设备编号
     */
    private String deviceNum;

    /**
     * 设备名称
     */
    private String deviceName;

    /**
     * 设备类型
     */
    private Integer deviceTypeName;

    /**
     * 设备类型id
     */
    private Long deviceTypeId;

    /**
     * 出厂编号
     */
    private String productNum;

    /**
     * 所属台区所属台区(主键)
     */
    private Long zoneAreaId;

    /**
     * 厂家名称
     */
    private String producterName;

    /**
     * 所属线路
     */
    private Long lineId;

    /**
     * 所属项目
     */
    private Long projectId;

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
    private Long updateTiem;

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
     * 设备编号
     *
     * @return device_num 设备编号
     */
    public String getDeviceNum() {
        return deviceNum;
    }

    /**
     * 设备编号
     *
     * @param deviceNum 设备编号
     */
    public void setDeviceNum(String deviceNum) {
        this.deviceNum = deviceNum == null ? null : deviceNum.trim();
    }

    /**
     * 设备名称
     *
     * @return device_name 设备名称
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * 设备名称
     *
     * @param deviceName 设备名称
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    /**
     * 设备类型
     *
     * @return device_type_name 设备类型
     */
    public Integer getDeviceTypeName() {
        return deviceTypeName;
    }

    /**
     * 设备类型
     *
     * @param deviceTypeName 设备类型
     */
    public void setDeviceTypeName(Integer deviceTypeName) {
        this.deviceTypeName = deviceTypeName;
    }

    /**
     * 设备类型id
     *
     * @return device_type_id 设备类型id
     */
    public Long getDeviceTypeId() {
        return deviceTypeId;
    }

    /**
     * 设备类型id
     *
     * @param deviceTypeId 设备类型id
     */
    public void setDeviceTypeId(Long deviceTypeId) {
        this.deviceTypeId = deviceTypeId;
    }

    /**
     * 出厂编号
     *
     * @return product_num 出厂编号
     */
    public String getProductNum() {
        return productNum;
    }

    /**
     * 出厂编号
     *
     * @param productNum 出厂编号
     */
    public void setProductNum(String productNum) {
        this.productNum = productNum == null ? null : productNum.trim();
    }

    /**
     * 所属台区所属台区(主键)
     *
     * @return zone_area_id 所属台区所属台区(主键)
     */
    public Long getZoneAreaId() {
        return zoneAreaId;
    }

    /**
     * 所属台区所属台区(主键)
     *
     * @param zoneAreaId 所属台区所属台区(主键)
     */
    public void setZoneAreaId(Long zoneAreaId) {
        this.zoneAreaId = zoneAreaId;
    }

    /**
     * 厂家名称
     *
     * @return producter_name 厂家名称
     */
    public String getProducterName() {
        return producterName;
    }

    /**
     * 厂家名称
     *
     * @param producterName 厂家名称
     */
    public void setProducterName(String producterName) {
        this.producterName = producterName == null ? null : producterName.trim();
    }

    /**
     * 所属线路
     *
     * @return line_id 所属线路
     */
    public Long getLineId() {
        return lineId;
    }

    /**
     * 所属线路
     *
     * @param lineId 所属线路
     */
    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    /**
     * 所属项目
     *
     * @return project_id 所属项目
     */
    public Long getProjectId() {
        return projectId;
    }

    /**
     * 所属项目
     *
     * @param projectId 所属项目
     */
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
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
     * @return update_tiem 更新时间
     */
    public Long getUpdateTiem() {
        return updateTiem;
    }

    /**
     * 更新时间
     *
     * @param updateTiem 更新时间
     */
    public void setUpdateTiem(Long updateTiem) {
        this.updateTiem = updateTiem;
    }
}
