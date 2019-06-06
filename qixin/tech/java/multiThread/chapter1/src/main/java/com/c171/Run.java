package com.c171;

/**
 * Created by qixin on 2017/7/23.
 */
public class Run {
    public static void main(String[] args) {

        try {
            MyThread171 myThread171 = new MyThread171();
            myThread171.start();

            System.out.println("Thread.sleep(10000).start");
            Thread.sleep(100);
            System.out.println("Thread.sleep(10000).end");
            System.out.println("myThread171.interrupt.start");
            myThread171.interrupt();
            /**
             * 当前线程
             */
            System.out.println("interrupted()= "+ myThread171.interrupted());
            /**
             * myThread171线程
             */
            System.out.println("isInterrupted()= "+ myThread171.isInterrupted());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
