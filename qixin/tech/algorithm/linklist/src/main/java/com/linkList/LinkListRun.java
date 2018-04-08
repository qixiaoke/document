package com.linkList;

/**
 * Created by qixin on 2017/8/14.
 */
public class LinkListRun {
    public static void main(String[] args) {
        Node<Integer> head = new Node<Integer>();

        Node index = head;
        for(int i = 0; i < 10; i++) {
            Node<Integer> node = new Node<Integer>();
            node.value = i;
            node.nextNode = null;

            index.nextNode = node;
            index = node;
        }

        printLinkList(head);
    }

    public static void printLinkList(Node head) {
        Node index = head.nextNode;
        while (index != null) {
            System.out.println(index.value);
            index = index.nextNode;
        }
    }

}
