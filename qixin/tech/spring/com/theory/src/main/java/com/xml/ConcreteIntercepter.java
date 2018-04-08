package com.xml;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by qixin on 2017/8/21.
 */
public class ConcreteIntercepter implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("proxy before");

        Object result = methodInvocation.proceed();

        System.out.println("proxy end");

        return result;
    }
}
