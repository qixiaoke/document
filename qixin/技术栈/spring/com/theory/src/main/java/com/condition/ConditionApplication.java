package com.condition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by qixin on 2018/2/13.
 */
public class ConditionApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);

        ListService listService = context.getBean(ListService.class);
        System.out.println(listService.showListCmd());
    }
}
