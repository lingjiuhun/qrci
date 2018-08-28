package com.share.inspect.qrci.enter;

public class Line {
    /**
     * 主键
     */
    private Long id;

    /**
     * 线路名称
     */
    private String lineName;

    /**
     * 线路类型
     */
    private Integer lineType;

    /**
     * 附件名称
     */
    private String fileName;

    /**
     * 附件路径
     */
    private String filePath;

    /**
     * 电压
     */
    private String lineVoltage;

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
     * 线路名称
     *
     * @return line_name 线路名称
     */
    public String getLineName() {
        return lineName;
    }

    /**
     * 线路名称
     *
     * @param lineName 线路名称
     */
    public void setLineName(String lineName) {
        this.lineName = lineName == null ? null : lineName.trim();
    }

    /**
     * 线路类型
     *
     * @return line_type 线路类型
     */
    public Integer getLineType() {
        return lineType;
    }

    /**
     * 线路类型
     *
     * @param lineType 线路类型
     */
    public void setLineType(Integer lineType) {
        this.lineType = lineType;
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
     * 电压
     *
     * @return line_voltage 电压
     */
    public String getLineVoltage() {
        return lineVoltage;
    }

    /**
     * 电压
     *
     * @param lineVoltage 电压
     */
    public void setLineVoltage(String lineVoltage) {
        this.lineVoltage = lineVoltage == null ? null : lineVoltage.trim();
    }
}
