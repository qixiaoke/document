package com.annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by qixin on 2017/8/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:annotation.xml")
@Component
public class AOPClient {
    @Autowired
    private Person chinesePersonImpl;

    @Autowired
    private ChinesePerson chinesePerson;

    @Test
    public void test() {
        chinesePersonImpl.sayHello();
        System.out.println(chinesePersonImpl.getClass());

        chinesePerson.sayHello();
        System.out.println(chinesePerson.getClass());
    }
}
