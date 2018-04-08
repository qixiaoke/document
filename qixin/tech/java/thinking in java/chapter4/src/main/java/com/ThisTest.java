package com;

/**
 * Created by qixin on 2017/7/21.
 */
public class ThisTest {
    private int i;

    public ThisTest increase() {
        i++;
        return this;
    }

    public void print() {
        System.out.println(i);
    }

    public static void main(String[] args) {
        ThisTest t = new ThisTest();
        t.increase().increase().increase().print();
        t.increase().increase().increase().print();

        System.out.println(t.increase() == t);

        try {
            double a = 1/0;
        } catch (Exception e) {
            double b = 1/0;
        } finally {
            System.out.println(1);
        }
    }
}
