package com.share.inspect.qrci.enter;

public class RepairInfo {
    /**
     * 主键
     */
    private Long id;

    /**
     * 联系方式
     */
    private String telphone;

    /**
     * 类型
     */
    private Integer repairType;

    /**
     * 所属对象主键(项目、设备厂家)
     */
    private Long owerId;

    /**
     * 所属对象类型
     */
    private Integer owerType;

    /**
     * 维护单位类型(施工工队、建设部门、运行维护)
     */
    private Integer repairUnitType;

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
     * 联系方式
     *
     * @return telphone 联系方式
     */
    public String getTelphone() {
        return telphone;
    }

    /**
     * 联系方式
     *
     * @param telphone 联系方式
     */
    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    /**
     * 类型
     *
     * @return repair_type 类型
     */
    public Integer getRepairType() {
        return repairType;
    }

    /**
     * 类型
     *
     * @param repairType 类型
     */
    public void setRepairType(Integer repairType) {
        this.repairType = repairType;
    }

    /**
     * 所属对象主键(项目、设备厂家)
     *
     * @return ower_id 所属对象主键(项目、设备厂家)
     */
    public Long getOwerId() {
        return owerId;
    }

    /**
     * 所属对象主键(项目、设备厂家)
     *
     * @param owerId 所属对象主键(项目、设备厂家)
     */
    public void setOwerId(Long owerId) {
        this.owerId = owerId;
    }

    /**
     * 所属对象类型
     *
     * @return ower_type 所属对象类型
     */
    public Integer getOwerType() {
        return owerType;
    }

    /**
     * 所属对象类型
     *
     * @param owerType 所属对象类型
     */
    public void setOwerType(Integer owerType) {
        this.owerType = owerType;
    }

    /**
     * 维护单位类型(施工工队、建设部门、运行维护)
     *
     * @return repair_unit_type 维护单位类型(施工工队、建设部门、运行维护)
     */
    public Integer getRepairUnitType() {
        return repairUnitType;
    }

    /**
     * 维护单位类型(施工工队、建设部门、运行维护)
     *
     * @param repairUnitType 维护单位类型(施工工队、建设部门、运行维护)
     */
    public void setRepairUnitType(Integer repairUnitType) {
        this.repairUnitType = repairUnitType;
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
