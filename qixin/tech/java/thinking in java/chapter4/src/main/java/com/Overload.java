package com;

/**
 * Created by qixin on 2017/7/21.
 */
public class Overload {

    private static void parse(float i) {
        System.out.println(i);
    }

    public static void main(String[] args) {
        int i = 10;
        parse(i);

        double d = 10.0;
        parse((float) d);
    }
}
