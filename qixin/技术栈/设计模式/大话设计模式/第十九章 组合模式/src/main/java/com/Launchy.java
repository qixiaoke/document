package com;

/**
 * Created by qixin on 2017/6/25.
 */
public class Launchy {
    public static void main(String[] args) {
        Component root = new Company("总公司");

        Component childA = new Company("子公司A");
        root.add(childA);

        Component childB = new Company("子公司B");
        root.add(childB);

        Component childAA = new Company("子公司AA");
        childA.add(childAA);

        root.show();
    }
}
