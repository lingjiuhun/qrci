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
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DeviceExtraVO {

    @JsonProperty(required = false)
    private Long categoryID;

    @JsonProperty("extra_id")
    private Long id;

    @JsonProperty
    private String name;

    @JsonProperty("value")
    private String value;
}
