package com;

/**
 * Created by qixin on 2017/6/24.
 */
public class Decorator implements Component {
    private Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        component.operate();
    }
}
