package com.c218;

/**
 * Created by qixin on 2017/7/23.
 */
public class Run {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();

        MyThread myThread1 = new MyThread(childClass);
        MyThread myThread2 = new MyThread(childClass);

        myThread1.setName("A");
        myThread2.setName("B");
        myThread1.start();
        myThread2.start();
    }
}
