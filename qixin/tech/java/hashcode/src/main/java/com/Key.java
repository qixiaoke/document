package com;

/**
 * Created by qixin on 2017/7/21.
 */
public class Key {
    public int k;

    public Key(int k) {
        this.k = k;
    }

    @Override
    public int hashCode() {
        return k;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Key) {
            return ((Key)obj).k == k;
        }
        return false;
    }
}
