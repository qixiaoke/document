package com;

import java.util.ServiceLoader;

/**
 * Created by qixin on 2018/4/9.
 */
public class SpiMain {

    public static void main(String[] args) {
        ServiceLoader<HelloService> helloServiceServiceLoader = ServiceLoader.load(HelloService.class);
        for(HelloService item : helloServiceServiceLoader) {
            item.say();
        }
    }
}
