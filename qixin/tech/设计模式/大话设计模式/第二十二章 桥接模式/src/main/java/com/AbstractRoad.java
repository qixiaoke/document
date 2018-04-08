package com;

/**
 * Created by qixin on 2017/6/25.
 */
public abstract class AbstractRoad {
    private AbstractCar abstractCar;

    public abstract void run();

    public AbstractCar getAbstractCar() {
        return abstractCar;
    }

    public void setAbstractCar(AbstractCar abstractCar) {
        this.abstractCar = abstractCar;
    }
}
