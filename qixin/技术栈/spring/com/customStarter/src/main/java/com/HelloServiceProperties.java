package com;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by qixin on 2018/2/14.
 */
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {
    private static final String MSG = "world";

    private String msg =MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
