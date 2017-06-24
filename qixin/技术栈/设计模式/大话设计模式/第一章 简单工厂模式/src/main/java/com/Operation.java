package com;

/**
 * Created by qixin on 2017/6/23.
 */
public abstract class Operation {
    private double number1 = 0.0;
    private double number2 = 0.0;

    protected double getNumber1() {
        return number1;
    }

    protected double getNumber2() {
        return number2;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public abstract double getResult() throws Exception;
}
