package com;

/**
 * Created by qixin on 2017/6/25.
 */
public class Launchy {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.dosomeThing();
    }
}
