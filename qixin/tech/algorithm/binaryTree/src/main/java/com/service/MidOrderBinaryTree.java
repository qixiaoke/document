package com.service;

import com.model.TreeNode;

/**
 * Created by qixin on 2017/8/20.
 */
public class MidOrderBinaryTree implements OrderBinaryTree {
    static {
        System.out.print("\nmidOrder : ");
    }

    public void doOrder(TreeNode treeNode) {
        if(treeNode == null) {
            return;
        }
        doOrder(treeNode.leftTreeNode);
        System.out.print(treeNode.value + "  ");
        doOrder(treeNode.rightTreeNode);
    }
}
