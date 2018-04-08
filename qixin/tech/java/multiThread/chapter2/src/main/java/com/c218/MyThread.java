package com.c218;

/**
 * Created by qixin on 2017/7/23.
 */
public class MyThread extends Thread {
    private FatherClass fatherClass;

    public MyThread(FatherClass fatherClass) {
        this.fatherClass = fatherClass;
    }

    @Override
    public void run() {
        super.run();
        fatherClass.syncFunc();
    }
}
