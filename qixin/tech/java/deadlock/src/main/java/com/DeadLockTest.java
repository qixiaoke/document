package com;

/**
 * Created by qixin on 2017/7/9.
 */
public class DeadLockTest {
    public static String objA = "objA";
    public static String objB = "objB";

    public static void main(String[] args) {
        new Thread(new LockA()).start();
        new Thread(new LockB()).start();
    }
}
