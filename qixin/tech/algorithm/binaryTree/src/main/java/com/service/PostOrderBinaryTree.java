package com.service;

import com.model.TreeNode;

/**
 * Created by qixin on 2017/8/20.
 */
public class PostOrderBinaryTree implements OrderBinaryTree {
    static {
        System.out.print("\npostOrder : ");
    }

    public void doOrder(TreeNode treeNode) {
        if(treeNode == null) {
            return;
        }
        doOrder(treeNode.leftTreeNode);
        doOrder(treeNode.rightTreeNode);
        System.out.print(treeNode.value + "  ");
    }
}
