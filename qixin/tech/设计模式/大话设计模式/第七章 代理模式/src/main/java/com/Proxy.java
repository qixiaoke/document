package com;

/**
 * Created by qixin on 2017/6/24.
 */
public class Proxy implements Idosomething {
    private Real real;

    public Proxy() {
        this.real = new Real();
    }

    @Override
    public void doA() {
        real.doA();
    }

    @Override
    public void doB() {
        real.doB();
    }
}
