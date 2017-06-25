package com;

/**
 * 构建和装配分开，该处只是装配
 * Created by qixin on 2017/6/25.
 */
public class Director {
    public void construct(Builder builder) {
        builder.buildB();
        builder.buildA();
        builder.buildC();
    }
}
