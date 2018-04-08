package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by qixin on 2017/6/25.
 */
public class Product {
    private List<String> list = new ArrayList<String>();

    public void addList(String name) {
        list.add(name);
    }

    @Override
    public String toString() {
        String show = "";
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            show += iterator.next() + ".";
        }
        return show;
    }
}
