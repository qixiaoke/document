package com;

/**
 * Created by qixin on 2017/7/23.
 */
public class EqualTest {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();

        System.out.println("a1 hashcode: " + a1.hashCode());
        System.out.println("a2 hashcode: " + a2.hashCode());
        System.out.println(a1.equals(a2));
        System.out.println(a1 == a2);
    }
}
