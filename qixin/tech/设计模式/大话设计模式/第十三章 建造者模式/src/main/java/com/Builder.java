package com;

/**
 * 构建与装配分开，该接口只是构建
 * Created by qixin on 2017/6/25.
 */
public interface Builder {
    public void buildA();

    public void buildB();

    public void buildC();

    public Product getResult();
}
