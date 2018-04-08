package com;

/**
 * Created by qixin on 2017/6/25.
 */
public class Launchy {
    public static void main(String[] args) {
        AbstractRoad roadA = new HighRoad();
        AbstractRoad roadB = new NormalRoad();

        AbstractCar carA = new BigCar();
        AbstractCar carB = new SmallCar();

        roadA.setAbstractCar(carA);
        roadA.run();
        roadA.setAbstractCar(carB);
        roadA.run();

        roadB.setAbstractCar(carA);
        roadB.run();
        roadB.setAbstractCar(carB);
        roadB.run();
    }
}
