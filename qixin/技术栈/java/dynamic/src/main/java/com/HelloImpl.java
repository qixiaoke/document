package com;

/**
 * Created by qixin on 2017/8/13.
 */
public class HelloImpl implements Hello {
    @Override
    public void sayHello(int i) {
        System.out.println("say hello: " + i);
    }
}
