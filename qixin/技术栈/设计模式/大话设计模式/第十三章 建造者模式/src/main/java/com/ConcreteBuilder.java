package com;

/**
 * Created by qixin on 2017/6/25.
 */
public class ConcreteBuilder implements Builder {
    Product product = new Product();

    @Override
    public void buildA() {
        product.addList("bulidA");
    }

    @Override
    public void buildB() {
        product.addList("bulidB");
    }

    @Override
    public void buildC() {
        product.addList("bulidC");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
