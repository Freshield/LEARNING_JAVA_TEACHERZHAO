package com.zhaozhepublic.collection.submit;

/**
 * Created by Coco Lv on 2016-06-03.
 */
public class LinkedListNode {
    private double value;
    private LinkedListNode nextNode;

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

    public LinkedListNode(double value) {
        this.value = value;
    }

    public LinkedListNode() {
    }


}
