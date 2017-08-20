package com.model;

/**
 * Created by qixin on 2017/8/20.
 */
public class TreeNode<T> {
    public T value;

    public TreeNode<T> leftTreeNode;

    public TreeNode<T> rightTreeNode;

    public TreeNode(T value) {
        this.value = value;
    }
}
