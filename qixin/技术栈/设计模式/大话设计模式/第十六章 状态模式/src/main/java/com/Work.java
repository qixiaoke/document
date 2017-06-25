package com;

/**
 * Created by qixin on 2017/6/25.
 */
public class Work {
    private State currentState;

    public void setState(State state) {
        this.currentState = state;
    }

    public void request() {
        currentState.dosomething();
    }
}
