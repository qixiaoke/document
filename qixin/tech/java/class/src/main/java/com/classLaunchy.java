package com;

/**
 * Created by qixin on 2017/7/15.
 */
public class classLaunchy {
    public static void main(String[] args) {
        Car car = new Car();
        Class clazz1 = car.getClass();

        Class clazz2 = null;
        try {
            clazz2 = Class.forName("com.Car");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Class clazz3 = Car.class;

        System.out.println("clazz1=" + clazz1 + " ,clazz2=" + clazz2 + " ,clazz3=" + clazz3);
    }
}
