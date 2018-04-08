package com.doubleLinkList;

/**
 * Created by qixin on 2017/8/15.
 */
public class DoubleNodeRun {
    public static void main(String[] args) {
        DoubleNode<Integer> head = new DoubleNode<Integer>();

        DoubleNode<Integer> index = head;
        for(int i = 0; i < 10; i++) {
            DoubleNode<Integer> doubleNode = new DoubleNode<Integer>();
            doubleNode.value = i;
            index.next = doubleNode;
            doubleNode.before = index;
            index = doubleNode;
        }

        printLinkList(head);
    }

    public static void printLinkList(DoubleNode head) {
        DoubleNode index = head.next;
        while (true) {
            System.out.println(index.value);
            if(index.next == null) {
                break;
            }
            index = index.next;
        }

        while (true) {
            System.out.println(index.value);
            if(index.before == head) {
                return;
            }
            index = index.before;
        }
    }
}
