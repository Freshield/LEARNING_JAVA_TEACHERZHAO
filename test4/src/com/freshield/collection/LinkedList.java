package com.freshield.collection;

/**
 * Created by Coco Lv on 2016-06-03.
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

        LinkedListNode n5 = new LinkedListNode(5);
        n4.setNextNode(n5);
    }

    public String description(){
        if (headNode == null){
            return "null";
        }else{
            String result = "";
            LinkedListNode node = headNode;
            result = "[" + headNode.getValue();
            while(node.getNextNode() != null){
                node = node.getNextNode();
                result += "," + node.getValue();
            }
            result += "]";
            return result;
        }
    }

    public int size(){
        LinkedListNode node = headNode;
        int i = 1;
        while (node.getNextNode() != null){
            node = node.getNextNode();
            i++;
        }
        return i;
    }

    public boolean isEmpty(){
        return headNode == null;
    }

    public double get(int index){
        LinkedListNode node = headNode;
        for (int i = 0; i< index; i++){
            node = node.getNextNode();
        }
        return node.getValue();
    }

    public double lastValue(){
        LinkedListNode node = headNode;
        while(node.getNextNode() != null){
            node = node.getNextNode();
        }
        return node.getValue();
    }

    public int indexOf(double value){
        LinkedListNode node = headNode;
        int i =0;
        while(node.getValue() != value){
            node = node.getNextNode();
            i++;
            if (i == size()){
                return i = -1;
            }
        }
        return i;
    }

    public boolean contains(double value){
        LinkedListNode node = headNode;
        int i = 0;
        while(node.getValue() != value){
            node = node.getNextNode();
            i++;
            if (i == size()-1){
                break;
            }
        }
        return i<size()-1;
    }

    public void add(double value){
        LinkedListNode addNode = new LinkedListNode(value);
        LinkedListNode node = headNode;
        while(node.getNextNode() != null){
            node = node.getNextNode();
        }
        node.setNextNode(addNode);
    }

    public void push(double value){
        LinkedListNode pushNode = new LinkedListNode(value);
        LinkedListNode node = headNode;
        while(node.getNextNode() != null){
            node = node.getNextNode();
        }
        node.setNextNode(pushNode);
    }

    public double pop(){
        LinkedListNode popnode = headNode;
        LinkedListNode nextNode = popnode.getNextNode();
        double deleteValue = 0;
        while(nextNode.getNextNode() != null){
            popnode = nextNode;
            nextNode = nextNode.getNextNode();
        }
        deleteValue = nextNode.getValue();
        popnode.setNextNode(null);
        return deleteValue;
    }

    public void remove(int index){
        LinkedListNode continueNode = headNode;
        LinkedListNode removeNode = continueNode.getNextNode();
        if (index == 0){
            headNode = removeNode;
        } else {
            for (int i = 0; i < index - 1; i++){
                continueNode = continueNode.getNextNode();
                removeNode = continueNode.getNextNode();
            }
            continueNode.setNextNode(removeNode.getNextNode());
        }
    }

    public void insert(int index, double value) {
        LinkedListNode insertNode = new LinkedListNode(value);
        LinkedListNode continueNode = headNode;
        if (index != 0){
            for (int i = 0; i < index - 1; i++) {
                continueNode = continueNode.getNextNode();
            }
            insertNode.setNextNode(continueNode.getNextNode());
            continueNode.setNextNode(insertNode);
        }else{
            headNode = insertNode;
            insertNode.setNextNode(continueNode);
        }
    }

    public void replace(int index, double value){
        LinkedListNode replaceNode = headNode;
        if (index != 0){
            for (int i = 0; i < index; i++){
                replaceNode = replaceNode.getNextNode();
            }
            replaceNode.setValue(value);
        }else{
            headNode.setValue(value);
        }
    }

    public void LinkedList(double[] values){
        LinkedListNode n1 = new LinkedListNode(values[0]);
        headNode = n1;
        for (int i = 1; i < values.length; i++){
            n1.setNextNode(new LinkedListNode(values[i]));
            n1 = n1.getNextNode();
        }
        n1.setNextNode(null);
    }

    public LinkedList subList(int fromIndex, int toIndex){
        LinkedList subList = new LinkedList();
        LinkedListNode node = headNode;
        for (int i = 0; i < fromIndex; i++){
            node = node.getNextNode();
        }
        subList.headNode = node;
        for (int i = 0; i < toIndex - fromIndex; i++){
            node = node.getNextNode();
        }
        node.setNextNode(null);
        return subList;
    }

    public void addAll(LinkedList list){
        LinkedList addList = new LinkedList();
        LinkedListNode n1 = headNode;
        addList.headNode = n1;
        int i = 0;
        while(n1.getNextNode() != null){
            n1 = n1.getNextNode();
        }
        n1.setNextNode(list.headNode);
    }

    public void removeAll(){
        headNode.setNextNode(null);
        headNode = null;
    }

    public void remove(int fromIndex, int toIndex){
        LinkedListNode n1 = headNode;
        LinkedListNode nodeBuffer = headNode;
        for (int i = 0; i < fromIndex -1; i++){
            n1 = n1.getNextNode();
            nodeBuffer = nodeBuffer.getNextNode();
        }
        nodeBuffer = nodeBuffer.getNextNode();
        for (int i = 0; i < toIndex - fromIndex; i++){
            nodeBuffer = nodeBuffer.getNextNode();
        }
        n1.setNextNode(nodeBuffer.getNextNode());
    }

    public void insert(int index, LinkedList list){
        LinkedListNode n1 = null;
        LinkedListNode continueNode = this.headNode;
        if (index == 0){
            headNode = list.headNode;
            n1 = list.headNode;
        }else{
            n1 = headNode;
            for (int i = 0; i < index - 1; i++) {
                n1 = n1.getNextNode();
                continueNode = continueNode.getNextNode();
            }
            continueNode = continueNode.getNextNode();
            n1.setNextNode(list.headNode);
        }
        while(n1.getNextNode() != null){
            n1 = n1.getNextNode();
        }
        n1.setNextNode(continueNode);
    }

    public void replace(int fromIndex, int toIndex, LinkedList list){
        LinkedListNode n1 = null;
        LinkedListNode toIndexNode = headNode;
        for (int i = 0; i < toIndex; i++){
            toIndexNode = toIndexNode.getNextNode();
        }
        if (fromIndex == 0){
            headNode = list.headNode;
            n1 = list.headNode;
        }else{
            n1 = headNode;
            for (int i = 0; i < fromIndex - 1; i++){
                n1 = n1.getNextNode();
            }
            n1.setNextNode(list.headNode);
        }
        toIndexNode = toIndexNode.getNextNode();
        while(n1.getNextNode() != null){
            n1 = n1.getNextNode();
        }
        n1.setNextNode(toIndexNode);
    }
}
