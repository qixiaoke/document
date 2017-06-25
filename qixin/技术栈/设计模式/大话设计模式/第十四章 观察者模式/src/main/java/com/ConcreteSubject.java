package com;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qixin on 2017/6/25.
 */
public class ConcreteSubject implements Subject {
    private List<Observer> observerList = new ArrayList<Observer>();

    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void sub(Observer observer) {
        if(observerList.contains(observer)) {
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observerList) {
            observer.update();
        }
    }
}
