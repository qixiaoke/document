package com;

/**
 * Created by qixin on 2017/6/25.
 */
public class Launchy {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director();
        director.construct(builder);

        Product product = builder.getResult();
        System.out.println(product.toString());
    }
}
