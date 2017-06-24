package com;

/**
 * Created by qixin on 2017/6/24.
 */
public class Context {
    private AbstractStrategy abstractStrategy;

    public Context(String strategyType) {
        switch (strategyType) {
            case "strategyOne": abstractStrategy = new StrategyOne();
            break;
            case "strategyTwo": abstractStrategy = new StrategyTwo();
            break;
        }
    }

    public void execAlg() {
        if(abstractStrategy != null) {
            abstractStrategy.execAlg();
        }
    }
}
