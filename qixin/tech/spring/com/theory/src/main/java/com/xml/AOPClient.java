package com.xml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by qixin on 2017/8/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:aop.xml")
public class AOPClient {
    @Autowired
//    @Qualifier("proxy")
    private OrderService orderService;

    @Test
    public void client() {
        orderService.save();
        orderService.delete();
    }
}
