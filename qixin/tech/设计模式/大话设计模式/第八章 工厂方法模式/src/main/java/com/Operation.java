package com;

/**
 * Created by qixin on 2017/6/24.
 */
public abstract class Operation {
    private double numberA;
    private double numberB;

    public abstract double getResule();

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }
}
