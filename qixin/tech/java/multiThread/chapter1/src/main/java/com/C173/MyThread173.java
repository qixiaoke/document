package com.C173;

/**
 * Created by qixin on 2017/7/23.
 */
public class MyThread173 extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("myThread173.start()");
        for(int i = 0; i < 50000; i++) {
            if(this.isInterrupted()) {
                break;
            }
            System.out.println("i= " + i);
        }
        System.out.println("myThread173.end()");
    }
}
