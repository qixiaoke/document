package com.service;

import com.model.TreeNode;

/**
 * Created by qixin on 2017/8/20.
 */
public class PreOrderBinaryTree implements OrderBinaryTree {
    static {
        System.out.print("\npreOrder : ");
    }

    public void doOrder(TreeNode treeNode) {
        if(treeNode == null) {
            return;
        }
        System.out.print(treeNode.value + "  ");
        doOrder(treeNode.leftTreeNode);
        doOrder(treeNode.rightTreeNode);
    }
}
