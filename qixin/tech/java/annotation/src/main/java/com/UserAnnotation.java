package com;

/**
 * Created by qixin on 2017/8/10.
 */
@TestA
public class UserAnnotation {
    @TestA
    private int age;

    @TestA
    public UserAnnotation() {
    }

    @TestA
    public void A(@TestA int arg) {
        /*
        声明在方法中的变量在使用时必须要初始化
        （注意这里是使用时，如果不使用的话，你也可以不赋值
        ，但是一般变量声明了之后都是要使用的，所以你最好初始化）
        ，否则不能通过编译。
         */
        @TestA
        int b;
//        System.out.println(b);
    }
}
