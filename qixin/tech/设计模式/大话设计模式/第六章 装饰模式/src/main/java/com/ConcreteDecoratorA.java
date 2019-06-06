package com;

/**
 * Created by qixin on 2017/6/24.
 */
public class ConcreteDecoratorA extends Decorator {
    @Override
    public void operate() {
        super.operate();
        System.out.println("this is concrete decorator A");
    }
}
