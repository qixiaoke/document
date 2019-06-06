package com;

/**
 * Created by qixin on 2017/6/24.
 */
public class Launchy {
    public static void main(String[] args) {
        IcreateOperation icreateOperation = new AddFactory();
        Operation operation1 = icreateOperation.createOperation();

        operation1.setNumberA(1);
        operation1.setNumberB(2);
        System.out.println(operation1.getResule());

        /**
         * 如果修改factory只需要更改AddFactory一个地方就可以了
         * 如果是简单工厂模式，就需要把每一个工厂调用都修改一遍
         */
        Operation operation2 = icreateOperation.createOperation();
        operation2.setNumberA(3);
        operation2.setNumberB(4);
        System.out.println(operation2.getResule());
    }
}
