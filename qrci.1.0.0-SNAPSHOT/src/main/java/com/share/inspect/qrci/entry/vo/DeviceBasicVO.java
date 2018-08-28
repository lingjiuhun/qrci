package com.share.inspect.qrci.entry.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

/**
 * @author Eric Chaw
 * @date 2018/2/5
 * @since 1.0.0
 */
@Component
@ToString
@Getter
@Setter
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeviceBasicVO {
    /**
     * 设备ID
     */
    @JsonProperty
    private Long id;

    /**
     * 设备名称
     */
    @JsonProperty
    private String name;

    /**
     * 所属系统名称
     */
    @JsonProperty
    private String system;

    /**
     * 设备类型名称
     */
    @JsonProperty
    private String category;

    /**
     * 所属区域名称
     */
    @JsonProperty
    private String zone;

    /**
     * 管理部门
     */
    @JsonProperty
    private String department;

    /**
     * 使用单位
     */
    @JsonProperty
    private String unit;

    /**
     * 是否生效
     */
    @JsonProperty
    private Boolean enable;
}
