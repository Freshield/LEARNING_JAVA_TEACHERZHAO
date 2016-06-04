/**
 * Created by FRESHIELD on 2016/6/3.
 */
public class LinkedList {

    private LinkedListNode headNode;

    //constructor


    public LinkedList() {

    }

    public void buildDemo() {
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

    //level1
    public String description() {

        String result = "";

        result += "[";

        LinkedListNode node = headNode;

        if (headNode != null) {

            while (true) {

                result += node.getValue();

                if (node.getNextNode() != null) {
                    result += ", ";
                    node = node.getNextNode();
                } else {
                    break;
                }
            }
        }


        result += "]";
        return result;
    }

    public int size() {
        int size = 0;
        if (!isEmpty()) {
            LinkedListNode node = headNode;
            size++;
            while (node.getNextNode() != null) {
                size++;
                node = node.getNextNode();
            }
        }
        return size;
    }

    public boolean isEmpty() {
        return headNode == null;
    }

    //level2
    public double get(int index) {
        LinkedListNode node = headNode;
        for (int i = 0; i < index; i++) {
            node = node.getNextNode();
        }
        return node.getValue();
    }

    public double lastValue() {
        return this.get(this.size() - 1);
    }

    public int indexof(double target) {
        LinkedListNode node = headNode;
        int count = 0;
        int result = -1;
        while (node.getNextNode() != null) {
            if (node.getValue() != target) {
                count++;
                node = node.getNextNode();
            } else {
                result = count;
                break;
            }

        }
        return result;
    }

    public boolean contains(double target) {
        return this.indexof(target) != -1;
    }

    //level3

    public void push(double value) {
        LinkedListNode node = headNode;
        LinkedListNode addNode = new LinkedListNode(value);
        while (node.getNextNode() != null) {
            node = node.getNextNode();
        }
        node.setNextNode(addNode);
    }

    public double pop() {
        LinkedListNode n1 = headNode;
        LinkedListNode n2 = n1.getNextNode();
        while (n2.getNextNode() != null) {
            n1 = n2;
            n2 = n2.getNextNode();
        }
        n1.setNextNode(null);
        return n2.getValue();
    }

    //level4
    public void remove(int index) {
        int count = 1;
        LinkedListNode n1 = headNode;
        LinkedListNode n2 = headNode.getNextNode();
        if (index == 0) {
            headNode = n2;
        } else {
            while (n2 != null) {
                if (count == index) {
                    n1.setNextNode(n2.getNextNode());
                    break;
                } else {
                    n1 = n2;
                    n2 = n2.getNextNode();
                    count++;
                }

            }
        }
    }

    public void insert(int index, double value) {
        int count = 1;
        LinkedListNode newNode = new LinkedListNode(value);
        LinkedListNode n1 = headNode;
        LinkedListNode n2 = headNode.getNextNode();
        if (index == 0) {
            headNode = newNode;
            newNode.setNextNode(n1);
        } else {
            while (n2 != null) {
                if (count == index) {
                    n1.setNextNode(newNode);
                    newNode.setNextNode(n2);
                    break;
                } else {
                    n1 = n2;
                    n2 = n2.getNextNode();
                    count++;
                }
            }
        }
    }


    public void replace(int index, double value) {
        int count = 1;
        LinkedListNode newNode = new LinkedListNode(value);
        LinkedListNode n1 = headNode;
        LinkedListNode n2 = headNode.getNextNode();
        if (index == 0) {
            headNode = newNode;
            newNode.setNextNode(n2);
        } else {
            while (n2 != null) {
                if (count == index) {
                    n1.setNextNode(newNode);
                    newNode.setNextNode(n2.getNextNode());
                    break;
                } else {
                    n1 = n2;
                    n2 = n2.getNextNode();
                    count++;
                }
            }
        }
    }

    //level5
    public LinkedList(double[] values) {
        headNode = new LinkedListNode(values[0]);
        LinkedListNode n1 = headNode;
        LinkedListNode n2;

        for (int i = 1; i < values.length; i++) {
            n2 = new LinkedListNode(values[i]);
            n1.setNextNode(n2);
            n1 = n2;
        }
    }

    public LinkedList subList(int fromIndex, int toIndex) {
        double[] result = new double[toIndex - fromIndex];

        int count = 0;
        LinkedListNode node = headNode;
        while (count != toIndex) {
            if (count == fromIndex) {
                for (int i = 0; i < result.length; i++) {
                    result[i] = node.getValue();
                    node = node.getNextNode();
                }
                break;
            } else {
                node = node.getNextNode();
                count++;
            }
        }
        LinkedList list = new LinkedList(result);
        return list;
    }

    public void addAll(LinkedList target) {
        LinkedListNode node = headNode;
        while (node.getNextNode() != null) {
            node = node.getNextNode();
        }
        node.setNextNode(target.headNode);
    }

    public void removeAll() {
        headNode = null;
    }

    //level6
    public void remove(int fromIndex, int toIndex) {
        LinkedListNode n1 = headNode;
        LinkedListNode n2;
        int count = 0;
        //get fromindex node
        while (count < fromIndex - 1) {
            n1 = n1.getNextNode();
            count++;
        }

//        System.out.println(count + " : " + n1.getValue());
        if (fromIndex == 0) {
            n2 = n1;
        } else {
            n2 = n1.getNextNode();
        }
        //get toIndex node
//        System.out.println(toIndex - fromIndex);
        for (int i = 0; i < toIndex - fromIndex; i++) {
            n2 = n2.getNextNode();
        }
//        System.out.println(n2.getValue());
        //link
        if (fromIndex == 0) {
            headNode = n2;
        } else {
            n1.setNextNode(n2);
        }

    }

    public void insert(int index, LinkedList list) {
        LinkedListNode n1 = headNode;
        LinkedListNode n2;
        //get headnode and lastnode
        LinkedListNode listHeadNode = list.headNode;
        LinkedListNode listLastNode = listHeadNode;
        while (listLastNode.getNextNode() != null) {
            listLastNode = listLastNode.getNextNode();
        }

        int count = 0;

        if (index == 0) {
            headNode = listHeadNode;
            listLastNode.setNextNode(n1);
        } else {
            //get the indexnode
            while (count < index - 1) {
                n1 = n1.getNextNode();
                count++;
            }
            n2 = n1.getNextNode();
            n1.setNextNode(listHeadNode);
            listLastNode.setNextNode(n2);
        }


    }

    public void replace(int fromIndex, int toIndex, LinkedList list) {
        LinkedListNode n1 = headNode;
        LinkedListNode n2;
        //get headnode and lastnode
        LinkedListNode listHeadNode = list.headNode;
        LinkedListNode listLastNode = listHeadNode;
        while (listLastNode.getNextNode() != null) {
            listLastNode = listLastNode.getNextNode();
        }

        int count = 0;

        //get fromindex node
        while (count < fromIndex - 1) {
            n1 = n1.getNextNode();
            count++;
        }

//        System.out.println(count + " : " + n1.getValue());
        if (fromIndex == 0) {
            n2 = n1;
        } else {
            n2 = n1.getNextNode();
        }
        //get toIndex node
//        System.out.println(toIndex - fromIndex);
        for (int i = 0; i < toIndex - fromIndex; i++) {
            n2 = n2.getNextNode();
        }
//        System.out.println(n2.getValue());
        //link
        if (fromIndex == 0) {
            headNode = listHeadNode;
            listLastNode.setNextNode(n2);
        } else {
            n1.setNextNode(listHeadNode);
            listLastNode.setNextNode(n2);
        }
    }

    //level7
    public void sort() {
        int size = this.size();
        double[] array = new double[size];
        double temp;

        LinkedListNode tempNode = headNode;
        LinkedListNode[] nodes = new LinkedListNode[size];
        //save nodes
        for (int i = 0; i < size; i++) {
            nodes[i] = tempNode;
            array[i] = tempNode.getValue();
            tempNode = tempNode.getNextNode();
        }

//        //test
//        for (int i = 0; i < size; i++) {
//            System.out.print(array[i]+" ");
//        }
//        System.out.println("");
//        //test
//        //test
//        for (int i = 0; i < size; i++) {
//            System.out.print(nodes[i].getValue()+" ");
//        }
//        System.out.println("");
//        //test


        //bubble
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    //for value
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    //for node
                    tempNode = nodes[j];
                    nodes[j] = nodes[j + 1];
                    nodes[j + 1] = tempNode;
                }
            }
        }
//
//
//        //test
//        for (int i = 0; i < size; i++) {
//            System.out.print(array[i]+" ");
//        }
//        //test
//        System.out.println("");
//        //test
//        for (int i = 0; i < size; i++) {
//            System.out.print(nodes[i].getValue()+" ");
//        }
//        System.out.println("");
//        //test


        //relink
        int index;
        headNode = nodes[0];
        for (int i = 0; i < size - 1; i++) {

            nodes[i].setNextNode(nodes[i + 1]);
        }
        nodes[size - 1].setNextNode(null);
    }

    public void shuffle() {
        int size = this.size();
        double[] array = new double[size];
        double temp;

        LinkedListNode tempNode = headNode;
        LinkedListNode[] nodes = new LinkedListNode[size];
        //save nodes
        for (int i = 0; i < size; i++) {
            nodes[i] = tempNode;
            array[i] = Math.random() * 100;
            tempNode = tempNode.getNextNode();
        }


        //bubble
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    //for value
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    //for node
                    tempNode = nodes[j];
                    nodes[j] = nodes[j + 1];
                    nodes[j + 1] = tempNode;
                }
            }
        }


        //relink
        int index;
        headNode = nodes[0];
        for (int i = 0; i < size - 1; i++) {

            nodes[i].setNextNode(nodes[i + 1]);
        }
        nodes[size - 1].setNextNode(null);
    }

}
