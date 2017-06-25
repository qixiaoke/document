package com;

/**
 * Created by qixin on 2017/6/25.
 */
public class ConcreteStateA implements State {
    private Work work;

    public ConcreteStateA(Work work) {
        this.work = work;
    }

    @Override
    public void dosomething() {
        System.out.println("do concreteStateA");
        work.setState(new ConcreteStateB(work));
        work.request();
    }
}
