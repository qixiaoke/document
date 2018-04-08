package com;

/**
 * Created by qixin on 2017/7/21.
 */
public class Init {
    private int a;
    private boolean trueFalse;
    private int b = initB();
    private int c = initC(b);

    public Init() {
        System.out.println("constructor");
    }

    public void print() {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("trueFalse: " + trueFalse);
    }

    private void func() {
        System.out.println("func");
    }

    /**
     * 成员变量初始化早于构造函数，成员变量调用initB，所以initB早于构造函数被调用
     * @return
     */
    private int initB() {
        System.out.println("func initB");
        return 1;
    }

    private int initC(int i) {
        return i + 1;
    }

    public static void main(String[] args) {
        Init init = new Init();

        init.print();

    }
}
