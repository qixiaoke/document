package com;

/**
 * Created by qixin on 2017/6/25.
 */
public class Launchy {
    public static void main(String[] args) {
        Observer observerA = new ConcreteObserver("A");
        Observer observerB = new ConcreteObserver("B");

        Subject subject = new ConcreteSubject();
        subject.add(observerA);
        subject.add(observerB);

        subject.notifyObserver();
    }
}
