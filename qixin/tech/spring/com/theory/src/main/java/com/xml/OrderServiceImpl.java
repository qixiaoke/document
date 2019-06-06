package com.xml;

/**
 * AOP target
 * Created by qixin on 2017/8/21.
 */
public class OrderServiceImpl implements OrderService {
    public void save() {
        System.out.println("do save");
    }

    public void delete() {
        System.out.println("do delete");
    }
}
