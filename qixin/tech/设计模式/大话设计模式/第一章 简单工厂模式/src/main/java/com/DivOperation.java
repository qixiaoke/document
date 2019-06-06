package com;

/**
 * Created by qixin on 2017/6/23.
 */
public class DivOperation extends Operation {
    public double getResult() throws Exception {
        if(getNumber2() == 0) {
            throw new Exception("除数不能为0");
        }

        return getNumber1() / getNumber2();
    }
}
