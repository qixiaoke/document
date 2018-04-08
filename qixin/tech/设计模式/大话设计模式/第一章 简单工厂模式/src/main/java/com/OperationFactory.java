package com;

/**
 * Created by qixin on 2017/6/23.
 */
public class OperationFactory {
    public static Operation createOperation(String operationSymbol) {
        Operation operation = null;
        switch (operationSymbol) {
            case "+": operation = new AddOperation();
            break;
            case "-": operation = new SubOperation();
            break;
            case "*": operation = new MulOperation();
            break;
            case "/": operation = new DivOperation();
            break;
        }
        return operation;
    }
}
