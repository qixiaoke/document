package com;

/**
 * Created by qixin on 2017/6/25.
 */
public class Launchy {
    public static void main(String[] args) {
        ConcreteStateA concreteStateA = new ConcreteStateA(new Work());
        concreteStateA.dosomething();
    }
}
