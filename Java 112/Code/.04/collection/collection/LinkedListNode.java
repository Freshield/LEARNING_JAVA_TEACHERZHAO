package com.zhaozhepublic.collection;

/**
 * Created by Zhaozhe on 6/3/16.
 */
public class LinkedListNode {
    private double value;
    private LinkedListNode nextNode;

    public LinkedListNode() {

    }

    public LinkedListNode(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public LinkedListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(LinkedListNode nextNode) {
        this.nextNode = nextNode;
    }
}
