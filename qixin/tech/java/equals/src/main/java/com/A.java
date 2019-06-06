package com;

/**
 * Created by qixin on 2017/7/23.
 */
public class A {
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof A) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (int) (Math.random()*10);
    }
}
