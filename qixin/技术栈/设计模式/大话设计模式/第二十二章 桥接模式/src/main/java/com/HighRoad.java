package com;

/**
 * Created by qixin on 2017/6/25.
 */
public class HighRoad extends AbstractRoad {
    @Override
    public void run() {
        getAbstractCar().run();
        System.out.println("形势在高速公路");
    }
}
