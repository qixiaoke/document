package com;

/**
 * Created by qixin on 2017/6/25.
 */
public class ConcreteStateC implements State {
    private Work work;

    public ConcreteStateC(Work work) {
        this.work = work;
    }

    @Override
    public void dosomething() {
        System.out.println("do ConcreteStateC");
    }
}
