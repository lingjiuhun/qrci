package com.share.inspect.qrci.entry.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

/**
 * @author Eric Chaw
 * @date 2018/2/4
 * @since 1.0.0
 */
@Component
@Getter
@Setter
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryItemVO {

    @JsonProperty
    private Long id;

    @JsonProperty
    private String system;

    @JsonProperty
    private String name;

    @JsonProperty
    private String description;
}
