package com.springEvent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * spring 事件测试
 * Created by qixin on 2018/2/13.
 */
public class EventApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);

        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);

        demoPublisher.publish("hello application event");

        context.close();
    }
}
