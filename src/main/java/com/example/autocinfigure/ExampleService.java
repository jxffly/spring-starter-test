package com.example.autocinfigure;

/**
 * Created by jinxiaofei.
 * Time 2018/3/7 下午9:09
 * Desc 文件描述
 */
public class ExampleService {

    private String prefix;
    private String suffix;

    public ExampleService(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }
    public String wrap(String word) {
        return prefix + word + suffix;
    }
}