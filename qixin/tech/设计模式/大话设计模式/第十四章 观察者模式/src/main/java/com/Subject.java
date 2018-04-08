package com;

/**
 * Created by qixin on 2017/6/25.
 */
public interface Subject {
    public void add(Observer observer);

    public void sub(Observer observer);

    public void notifyObserver();

}
