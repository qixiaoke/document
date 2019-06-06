package com;

/**
 * Created by qixin on 2017/6/23.
 */
public class Launchy {
    public static void main(String[] args) throws Exception {
        Operation operation = OperationFactory.createOperation("+");
        operation.setNumber1(1);
        operation.setNumber2(2);

        System.out.println(operation.getResult());
    }
}
