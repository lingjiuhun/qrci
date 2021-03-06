package com.share.inspect.qrci.enter;

public class OperationInstruction {
    /**
     * 主键
     */
    private Long id;

    /**
     * 名称
     */
    private String instructionName;

    /**
     * 附件名称
     */
    private String fileName;

    /**
     * 附件路径
     */
    private String filePath;

    /**
     * 类型
     */
    private Integer instructionType;

    /**
     * 所属设备
     */
    private Long deviceId;

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
     * 名称
     *
     * @return instruction_name 名称
     */
    public String getInstructionName() {
        return instructionName;
    }

    /**
     * 名称
     *
     * @param instructionName 名称
     */
    public void setInstructionName(String instructionName) {
        this.instructionName = instructionName == null ? null : instructionName.trim();
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
     * 类型
     *
     * @return instruction_type 类型
     */
    public Integer getInstructionType() {
        return instructionType;
    }

    /**
     * 类型
     *
     * @param instructionType 类型
     */
    public void setInstructionType(Integer instructionType) {
        this.instructionType = instructionType;
    }

    /**
     * 所属设备
     *
     * @return device_id 所属设备
     */
    public Long getDeviceId() {
        return deviceId;
    }

    /**
     * 所属设备
     *
     * @param deviceId 所属设备
     */
    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
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
