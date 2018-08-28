package com.share.inspect.qrci.conf;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Eric Chaw
 * @since 2017/11/13 14:50
 */
@Component
@Getter
@Setter
public class AppConfiguration {

    /**
     * 后台分页默认值
     */
    @Value("${page.default_size}")
    private Integer defaultSize;
}
