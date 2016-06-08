package com.zhaozhepublic.collection;

/**
 * Created by Zhaozhe on 6/3/16.
 */
public class LinkedList {
    private LinkedListNode headNode;

    public void buildDemo(){
        LinkedListNode n1 = new LinkedListNode(6);
        headNode = n1;

        LinkedListNode n2 = new LinkedListNode(7);
        n1.setNextNode(n2);

        LinkedListNode n3 = new LinkedListNode(3);
        n2.setNextNode(n3);

        LinkedListNode n4 = new LinkedListNode(8);
        n3.setNextNode(n4);

        LinkedListNode n5 = new LinkedListNode(4);
        n4.setNextNode(n5);
    }

    public int size(){
        LinkedListNode node = headNode;
        int count = 0;
        while (node != null){
            count ++;
            node = node.getNextNode();
        }
        return count;
    }




}
