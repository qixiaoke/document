package com;

/**
 * Created by qixin on 2017/6/25.
 */
public class NormalRoad extends AbstractRoad {
    @Override
    public void run() {
        getAbstractCar().run();
        System.out.println("行驶在普通公路");
    }
}
