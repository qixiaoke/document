package com.model;

/**
 * Created by qixin on 2017/8/20.
 */

/**
 *              a
 *            |   \
 *           b     c
 *       |      \
 *      d        f
 *       \      |
 *        e    g
 */
public class BinaryTreeModel1 {
    public TreeNode<String> createBinaryTree() {
        TreeNode nodeA = new TreeNode("a");
        TreeNode nodeB = new TreeNode("b");
        TreeNode nodeC = new TreeNode("c");
        TreeNode nodeD = new TreeNode("d");
        TreeNode nodeE = new TreeNode("e");
        TreeNode nodeF = new TreeNode("f");
        TreeNode nodeG = new TreeNode("g");

        nodeA.leftTreeNode = nodeB;
        nodeA.rightTreeNode = nodeC;
        nodeB.leftTreeNode = nodeD;
        nodeB.rightTreeNode = nodeF;
        nodeD.rightTreeNode = nodeE;
        nodeF.leftTreeNode = nodeG;

        return nodeA;
    }
}
