package com;

/**
 * Created by qixin on 2017/6/25.
 */
public class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name + "receive notify");
    }
}
