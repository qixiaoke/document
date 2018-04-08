package com.aop;

import org.springframework.stereotype.Service;

/**
 * Created by qixin on 2018/2/15.
 */
@Service
public class DemoAnnotationService {

    @Action(name = "注解式拦截")
    public void add() {

    }
}
