package com.share.inspect.qrci.enter;

public class DeviceTypeProperty {
    /**
     * 主键
     */
    private Long id;

    /**
     * 设备类型id
     */
    private Long deviceTypeId;

    /**
     * 属性名称
     */
    private String propertyName;

    /**
     * 属性值
     */
    private String propertyValue;

    /**
     * 属性标识(服务端自动生成)
     */
    private String propertyKey;

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
     * 属性名称
     *
     * @return property_name 属性名称
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * 属性名称
     *
     * @param propertyName 属性名称
     */
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName == null ? null : propertyName.trim();
    }

    /**
     * 属性值
     *
     * @return property_value 属性值
     */
    public String getPropertyValue() {
        return propertyValue;
    }

    /**
     * 属性值
     *
     * @param propertyValue 属性值
     */
    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue == null ? null : propertyValue.trim();
    }

    /**
     * 属性标识(服务端自动生成)
     *
     * @return property_key 属性标识(服务端自动生成)
     */
    public String getPropertyKey() {
        return propertyKey;
    }

    /**
     * 属性标识(服务端自动生成)
     *
     * @param propertyKey 属性标识(服务端自动生成)
     */
    public void setPropertyKey(String propertyKey) {
        this.propertyKey = propertyKey == null ? null : propertyKey.trim();
    }
}
