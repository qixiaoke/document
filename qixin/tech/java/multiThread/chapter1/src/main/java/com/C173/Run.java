package com.C173;

/**
 * Created by qixin on 2017/7/23.
 */
public class Run {
    public static void main(String[] args) {

        try {
            MyThread173 myThread173 = new MyThread173();
            myThread173.start();

            System.out.println("Thread.sleep(10000).start");
            Thread.sleep(100);
            System.out.println("Thread.sleep(10000).end");
            System.out.println("myThread173.interrupt.start");
            myThread173.interrupt();
            /**
             * 当前线程
             */
            System.out.println("interrupted()= "+ myThread173.interrupted());
            /**
             * myThread171线程
             */
            System.out.println("isInterrupted()= "+ myThread173.isInterrupted());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
