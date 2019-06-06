package com;

/**
 * Created by qixin on 2017/6/25.
 */
public class GamePerson {
    private String state;

    public Memento save() {
        Memento memento = new Memento();
        memento.setState(state);
        return memento;
    }

    public void load(Memento memento) {
        state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
