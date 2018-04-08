package com.staticTest;

/**
 * Created by qixin on 2017/7/22.
 */
public class StaticA {
    static StaticB staticB = new StaticB();

    public StaticA() {
        System.out.println("constructor A");
    }
}
