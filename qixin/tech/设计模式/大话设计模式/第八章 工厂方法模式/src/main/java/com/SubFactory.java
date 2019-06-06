package com;

/**
 * Created by qixin on 2017/6/24.
 */
public class SubFactory implements IcreateOperation {
    @Override
    public Operation createOperation() {
        return new SubOperation();
    }
}
