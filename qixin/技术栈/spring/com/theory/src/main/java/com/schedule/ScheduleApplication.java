package com.schedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by qixin on 2018/2/13.
 */
public class ScheduleApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScheduleConfig.class);

    }
}
