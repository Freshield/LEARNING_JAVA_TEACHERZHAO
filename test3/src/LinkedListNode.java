/**
 * Created by FRESHIELD on 2016/6/3.
 */
public class LinkedListNode {

    private double value;
    private LinkedListNode nextNode;

    //constructor


    public LinkedListNode(double value) {
        this.value = value;
    }

    public LinkedListNode() {

    }

    //getter and setter
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
