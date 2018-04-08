package com;

/**
 * Created by qixin on 2017/6/25.
 */
public class ConcreteStateB implements State {
    private Work work;

    public ConcreteStateB(Work work) {
        this.work = work;
    }

    @Override
    public void dosomething() {
        System.out.println("do concreteStateB");
        work.setState(new ConcreteStateC(work));
        work.request();
    }
}
