package com.example.autocinfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;


/**
 * Created by jinxiaofei.
 * Time 2018/3/7 下午9:11
 * Desc 文件描述
 */
@ConfigurationProperties("example.service")
@Data
public class ExampleServiceProperties {

    private String prefix;

    private String suffix;
    //省略 getter setter
}
