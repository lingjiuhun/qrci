package com.share.inspect.qrci.entry.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 设备VO
 *
 * @author Eric Chaw
 * @date 2018/2/1
 * @since 1.0.0
 */
@Component
@ToString
@Getter
@Setter
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DeviceVO {

    /**
     * 设备ID
     */
    @JsonProperty
    private Long id;

    @JsonProperty("name")
    private String alias;

    /**
     * 所属系统ID
     */
    @JsonProperty("system_id")
    private Integer systemID;

    /**
     * 所属系统名称
     */
    @JsonProperty
    private String system;

    /**
     * 设备类型ID
     */
    @JsonProperty("category_id")
    private Long categoryID;

    /**
     * 设备类型名称
     */
    @JsonProperty
    private String category;

    /**
     * 所属区域ID
     */
    @JsonProperty("zone_id")
    private String zoneID;

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

    /**
     * 产品型号
     */
    @JsonProperty
    private String model;

    /**
     * 设备SN码
     */
    @JsonProperty
    private String sn;

    /**
     * 生产厂家
     */
    @JsonProperty
    private String manufacturer;

    /**
     * 出厂日期
     */
    @JsonProperty("release_date")
    private LocalDateTime releaseDate;

    /**
     * 保修期
     */
    @JsonProperty
    private String warranty;

    /**
     * 维保单位
     */
    @JsonProperty
    private String maintenance;

    /**
     * 维保责任人
     */
    @JsonProperty
    private String contact;

    /**
     * 维保人电话
     */
    @JsonProperty("contact_phone")
    private String contactPhone;

    @JsonProperty("capacities")
    private List<DeviceCapacityVO> capacities;

    @JsonProperty("extra")
    private List<DeviceExtraVO> extra;
}
