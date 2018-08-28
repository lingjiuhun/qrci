package com.share.inspect.qrci.enter;

public class Project {
    /**
     * 主键
     */
    private Long id;

    /**
     * 项目编号
     */
    private String projectNum;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 项目位置
     */
    private String projectPosition;

    /**
     * 竣工时间
     */
    private Long finishTime;

    /**
     * 类型
     */
    private Integer projectType;

    /**
     * 建设单位
     */
    private String developmentUnit;

    /**
     * 设备厂家
     */
    private String manufacturer;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 更新时间
     */
    private Long updateTime;

    /**
     * 备注
     */
    private String comment;

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
     * 项目编号
     *
     * @return project_num 项目编号
     */
    public String getProjectNum() {
        return projectNum;
    }

    /**
     * 项目编号
     *
     * @param projectNum 项目编号
     */
    public void setProjectNum(String projectNum) {
        this.projectNum = projectNum == null ? null : projectNum.trim();
    }

    /**
     * 项目名称
     *
     * @return project_name 项目名称
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * 项目名称
     *
     * @param projectName 项目名称
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    /**
     * 项目位置
     *
     * @return project_position 项目位置
     */
    public String getProjectPosition() {
        return projectPosition;
    }

    /**
     * 项目位置
     *
     * @param projectPosition 项目位置
     */
    public void setProjectPosition(String projectPosition) {
        this.projectPosition = projectPosition == null ? null : projectPosition.trim();
    }

    /**
     * 竣工时间
     *
     * @return finish_time 竣工时间
     */
    public Long getFinishTime() {
        return finishTime;
    }

    /**
     * 竣工时间
     *
     * @param finishTime 竣工时间
     */
    public void setFinishTime(Long finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * 类型
     *
     * @return project_type 类型
     */
    public Integer getProjectType() {
        return projectType;
    }

    /**
     * 类型
     *
     * @param projectType 类型
     */
    public void setProjectType(Integer projectType) {
        this.projectType = projectType;
    }

    /**
     * 建设单位
     *
     * @return development_unit 建设单位
     */
    public String getDevelopmentUnit() {
        return developmentUnit;
    }

    /**
     * 建设单位
     *
     * @param developmentUnit 建设单位
     */
    public void setDevelopmentUnit(String developmentUnit) {
        this.developmentUnit = developmentUnit == null ? null : developmentUnit.trim();
    }

    /**
     * 设备厂家
     *
     * @return manufacturer 设备厂家
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * 设备厂家
     *
     * @param manufacturer 设备厂家
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
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
}
