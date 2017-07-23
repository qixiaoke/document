package com.c111;

/**
 * Created by qixin on 2017/7/23.
 */
public class Run {
    public static void main(String[] args) {
        /**
         * 所有非守护线程都结束了，守护线程也就结束了
         */

        try {
            MyThread111 myThread111 = new MyThread111();
            myThread111.setDaemon(true);
            myThread111.start();

            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
