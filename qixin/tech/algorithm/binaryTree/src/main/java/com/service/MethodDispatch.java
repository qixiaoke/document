package com.service;

import com.enumm.OrderEnum;

/**
 * Created by qixin on 2017/8/20.
 */
public final class MethodDispatch {
    public static OrderBinaryTree createOrderMethod(OrderEnum orderEnum) {
        switch (orderEnum) {
            case PreOrder : return new PreOrderBinaryTree();
            case MidOrder : return new MidOrderBinaryTree();
            case PostOrder: return new PostOrderBinaryTree();
            default : return null;
        }
    }
}
