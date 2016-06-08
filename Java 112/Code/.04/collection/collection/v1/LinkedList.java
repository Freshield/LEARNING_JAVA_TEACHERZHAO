package com.zhaozhepublic.collection.v1;

public class LinkedList {
	private LinkedListNode headNode;
	
	public LinkedList(){
		
	}
	
	/*
	 * Mark - Level 1 - Methods
	 */
	 
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
	
	public String toString(){
		String out = "[";

        if (!isEmpty()){
            LinkedListNode currentNode = headNode;
            out = out + currentNode.getValue();

            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
                out += ", ";
                out += currentNode.getValue();
            }
        }
		
		out = out + "]";
		return out;
	}
	
	public int size(){
		int count = 0;
		LinkedListNode currentNode = headNode;
		
		while (currentNode != null){
			count ++;
			currentNode = currentNode.getNextNode();
		}
		
		return count;
	}
	
	public boolean isEmpty(){
		return this.headNode == null;
	}
	
	/*
	 * Mark - Level 2 - Methods
	 */
	
	public double get(int index){
        if (index < 0 || index >= size()){
            return 0.0;
        }

		return getNode(index).getValue();
	}
	
	public LinkedListNode lastNode(){
		if (isEmpty()){
			return null;
		}

        LinkedListNode currentNode = headNode;
        while(currentNode.getNextNode() != null){
            currentNode = currentNode.getNextNode();
        }
        return currentNode;
	}
	
	public int indexOf(double value){
		if (isEmpty()) {
			return -1;
		}

        int index = 0;
        LinkedListNode currentNode = headNode;
        do {
            if (currentNode.getValue() == value) {
                return index;
            }

            currentNode = currentNode.getNextNode();
            index ++;

        } while(currentNode.getNextNode() != null);

        return -1;

	}
	
	public boolean contains(double value){
		return indexOf(value) > -1;
	}
	
	/*
	 * Mark - Level 3 - Methods
	 */
	
	public void add (double value){
		LinkedListNode newNode = new LinkedListNode(value);
		
		if (isEmpty()) {
			headNode = newNode;

		} else {
			lastNode().setNextNode(newNode);

		}
	}
	
	public void push (double value) {
		add(value);
	}
	
	public double pop () {
		if (isEmpty()){
            return 0;
		}

        int size = this.size();
        double value;
        if (size == 1){
			value = headNode.getValue();
			headNode = null;
			
		} else {
			LinkedListNode secondLastNode = getNode(size - 2);
			value = secondLastNode.getNextNode().getValue();
			secondLastNode.setNextNode(null);
		}
		
		return value;
	}

	/*
	 * Mark - Level 4 - Methods
	 */

    public void remove(int index){
        if (index < 0 || index >= size()){
            return ;
        }

		if (size() == 1) {
			headNode = null;

		} else {
			LinkedListNode leftNode = getNode(index - 1);
			LinkedListNode rightNode = seekNode(leftNode, 2);
			leftNode.setNextNode(rightNode);
		}
	}
	
	public void insert(int index, double value) {
        if (index < 0 || index >= size()){
            return ;
        }

		LinkedListNode newNode = new LinkedListNode(value);
		
		if (index == 0) {
			newNode.setNextNode(headNode);
			headNode = newNode;

		} else {
			LinkedListNode leftNode = getNode(index - 1);
			newNode.setNextNode(leftNode.getNextNode());
			leftNode.setNextNode(newNode);
		}
	}
	
	public void replace(int index, double value) {
        if (index < 0 || index >= size()){
            return ;
        }

		getNode(index).setValue(value);
	}
	
	/*
	 * Mark - Level 5 - Methods
	 */
	
	public LinkedList (double[] values) {
		if (values.length > 0) {
			headNode = new LinkedListNode(values[0]);
			
			LinkedListNode theLastNode = headNode;
			for (int i = 1; i < values.length; i++) {
				LinkedListNode newNode = new LinkedListNode(values[i]);
				theLastNode.setNextNode(newNode);
				theLastNode = newNode;
			}
		}
	}
	
	public LinkedList subList(int fromIndex, int toIndex) {

        if (fromIndex < 0 || fromIndex >= size()){
            return null;
        }

        if (toIndex < 0 || toIndex > size()){
            return null;
        }

        if (fromIndex > toIndex) {
            return null;
        }

		LinkedList newList = new LinkedList();
		if (toIndex > fromIndex) {
			
			LinkedListNode currentNode = getNode(fromIndex);
			newList.headNode = currentNode.copy();
			LinkedListNode theLastNode = newList.headNode;
			currentNode = currentNode.getNextNode();
			
			for (int i = fromIndex + 1; i < toIndex; i++) {
				LinkedListNode newNode = currentNode.copy();
				theLastNode.setNextNode(newNode);
				theLastNode = newNode;
				
				currentNode = currentNode.getNextNode();
			}
		}
		return newList;
	}
	
	
	/*
	 * Mark - Shared - Methods
	 */

    private LinkedListNode getNode(int index){
        return seekNode(headNode, index);
    }

	private LinkedListNode seekNode(LinkedListNode fromNode, int step){
		LinkedListNode currentNode = fromNode;
		for (int i = 0 ; i < step; i++) {
			currentNode = currentNode.getNextNode();
		}
		return currentNode;
	}
}
