package com.value;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by qixin on 2018/2/14.
 */
public class ValueApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);

        ElConfig elConfig = context.getBean(ElConfig.class);
        elConfig.output();
    }
}
