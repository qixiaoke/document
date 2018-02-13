package com.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * spring profile测试
 * Created by qixin on 2018/2/13.
 */
public class ProfileApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.getEnvironment().setActiveProfiles("prod");
        context.register(ProfileConfig.class);
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);

        System.out.println(demoBean.getAttr());

        context.close();
    }
}
