package com.share.inspect.qrci.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice;

/**
 * @author Eric Chaw
 * @date 2017/12/29
 * @since 1.0.0
 */
@ControllerAdvice(basePackages = "com.hollysys.hollipark.rws.controller")
public class JsonpAdvice extends AbstractJsonpResponseBodyAdvice {
    public JsonpAdvice() {
        super("callback", "jsonp");
    }
}
