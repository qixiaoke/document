package com;

/**
 * Created by qixin on 2017/6/24.
 */
public class ConcreteComponent implements Component {
    @Override
    public void operate() {
        System.out.println("this is concrete component");
    }
}
