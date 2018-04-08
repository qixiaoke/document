package com.annotation;

import org.springframework.stereotype.Component;

/**
 * Created by qixin on 2017/8/21.
 */
@Component
public class ChinesePersonImpl implements Person {
    @Timer
    @Override
    public void sayHello() {
        System.out.println("say hello");
    }
}
