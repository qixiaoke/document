package com.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by qixin on 2017/8/21.
 */
@Aspect
@Component
public class AspectTest {
    @Pointcut("@annotation(Timer)")
    public void pointcut() {

    };

    @Before("pointcut()")
    public void before() {
        System.out.println("before");
    }

    @After("pointcut()")
    public void after() {
        System.out.println("after");
    }

    @Around("pointcut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("around1");
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("around2");
    }
}
