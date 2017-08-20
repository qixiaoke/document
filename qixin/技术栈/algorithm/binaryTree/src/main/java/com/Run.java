package com;

import com.enumm.OrderEnum;
import com.model.BinaryTreeModel1;
import com.service.MethodDispatch;
import com.service.OrderBinaryTree;

/**
 * Created by qixin on 2017/8/20.
 */
public class Run {
    public static void main(String[] args) {
        BinaryTreeModel1 binaryTreeModel = new BinaryTreeModel1();

        OrderBinaryTree orderBinaryTree = MethodDispatch.createOrderMethod(OrderEnum.PreOrder);
        orderBinaryTree.doOrder(binaryTreeModel.createBinaryTree());
        orderBinaryTree = MethodDispatch.createOrderMethod(OrderEnum.MidOrder);
        orderBinaryTree.doOrder(binaryTreeModel.createBinaryTree());
        orderBinaryTree = MethodDispatch.createOrderMethod(OrderEnum.PostOrder);
        orderBinaryTree.doOrder(binaryTreeModel.createBinaryTree());

    }
}
