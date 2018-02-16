package com.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by qixin on 2018/2/15.
 */
public class AopApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        demoAnnotationService.add();
        context.close();
    }
}
