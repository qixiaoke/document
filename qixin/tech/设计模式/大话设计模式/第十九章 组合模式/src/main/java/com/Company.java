package com;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qixin on 2017/6/25.
 */
public class Company implements Component {
    private String name;
    private List<Component> list = new ArrayList<Component>();

    public Company(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void delete(Component component) {
        list.remove(component);
    }

    @Override
    public void show() {
        //此处应该用深度变量
        System.out.println("--" + name);
        for(Component component : list) {
            component.show();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
