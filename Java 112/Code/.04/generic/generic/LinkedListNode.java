package com.zhaozhepublic.generic;

public class LinkedListNode<T> {
	private T value;
	private LinkedListNode nextNode;
	
	public LinkedListNode() {
		super();
	}
	
	public LinkedListNode(T value) {
		super();
		this.value = value;
	}
	
	public LinkedListNode copy(){
		return new LinkedListNode(value);
	}
	
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}

	public LinkedListNode getNextNode() {
		return nextNode;
	}
	public void setNextNode(LinkedListNode nextNode) {
		this.nextNode = nextNode;
	}
	

}
