package com.count;

/**
 * Created by qixin on 2017/7/23.
 */
public class Run {
    public static void main(String[] args) {
        CountOperate countOperate = new CountOperate();

        Thread t = new Thread(countOperate);
        t.setName("B");
        t.start();
    }
}
