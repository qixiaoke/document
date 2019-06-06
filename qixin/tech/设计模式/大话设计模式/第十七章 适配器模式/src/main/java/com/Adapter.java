package com;

/**
 * Created by qixin on 2017/6/25.
 */
public class Adapter implements Target {
    private Real real = new Real();

    @Override
    public void dosomeThing() {
        real.doRealThing();
    }
}
