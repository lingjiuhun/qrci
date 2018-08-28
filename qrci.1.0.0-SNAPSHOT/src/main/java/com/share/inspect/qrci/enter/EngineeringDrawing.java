package com.share.inspect.qrci.enter;

public class EngineeringDrawing {
    /**
     * 主键
     */
    private Long id;

    /**
     * 名称
     */
    private String drawName;

    /**
     * 编号
     */
    private String drawNum;

    /**
     * 附件路径
     */
    private String filePath;

    /**
     * 附件名称
     */
    private String fileName;

    /**
     * 图纸类型
     */
    private Integer drawType;

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
     * @return draw_name 名称
     */
    public String getDrawName() {
        return drawName;
    }

    /**
     * 名称
     *
     * @param drawName 名称
     */
    public void setDrawName(String drawName) {
        this.drawName = drawName == null ? null : drawName.trim();
    }

    /**
     * 编号
     *
     * @return draw_num 编号
     */
    public String getDrawNum() {
        return drawNum;
    }

    /**
     * 编号
     *
     * @param drawNum 编号
     */
    public void setDrawNum(String drawNum) {
        this.drawNum = drawNum == null ? null : drawNum.trim();
    }

    /**
     * 附件路径
     *
     * @return file_path 附件路径
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * 附件路径
     *
     * @param filePath 附件路径
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    /**
     * 附件名称
     *
     * @return file_name 附件名称
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * 附件名称
     *
     * @param fileName 附件名称
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * 图纸类型
     *
     * @return draw_type 图纸类型
     */
    public Integer getDrawType() {
        return drawType;
    }

    /**
     * 图纸类型
     *
     * @param drawType 图纸类型
     */
    public void setDrawType(Integer drawType) {
        this.drawType = drawType;
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
