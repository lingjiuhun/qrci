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
public class CategoryVO {

    /**
     * id
     */
    @JsonProperty
    private Long id;

    /**
     * system id
     */
    @JsonProperty("system_id")
    private Long systemID;

    /**
     * name
     */
    @JsonProperty
    private String name;

    /**
     * description
     */
    @JsonProperty
    private String description;
}
