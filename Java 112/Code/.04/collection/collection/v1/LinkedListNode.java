package com.zhaozhepublic.collection.v1;

public class LinkedListNode {

	private double value;
	private LinkedListNode nextNode;
	
	public LinkedListNode() {
		super();
	}
	
	public LinkedListNode(double value) {
		super();
		this.value = value;
	}
	
	public LinkedListNode copy(){
		return new LinkedListNode(value);
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
