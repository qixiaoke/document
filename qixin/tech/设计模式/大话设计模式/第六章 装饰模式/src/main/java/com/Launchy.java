package com;

/**
 * Created by qixin on 2017/6/24.
 */
public class Launchy {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB();

        concreteDecoratorA.setComponent(component);
        concreteDecoratorB.setComponent(concreteDecoratorA);

        concreteDecoratorB.operate();
    }
}
