package com;

/**
 * Created by qixin on 2017/7/22.
 */
public class VariableArgumentType {

    public void func(int... args) {
        for(int i : args) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        VariableArgumentType variableArgumentType = new VariableArgumentType();
        variableArgumentType.func();
        variableArgumentType.func(1);
        variableArgumentType.func(new int[]{1, 2, 3});
        variableArgumentType.func(1, 2, 3);
    }
}
