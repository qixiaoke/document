package com;

/**
 * Created by qixin on 2018/4/9.
 */
public class CustomHelloService implements HelloService {
    @Override
    public void say() {
        System.out.println("CustomHelloService say");
    }
}
