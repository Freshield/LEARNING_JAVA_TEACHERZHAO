/**
 * Created by FRESHIELD on 2016/6/3.
 */
public class LinkedListTest {
    public void run() {
        LinkedList list = new LinkedList();
        list.buildDemo();
//        System.out.println(list.description());
//        System.out.println(list.size());
//        System.out.println(list.isEmpty());
//        System.out.println(list.get(3));
//        System.out.println(list.lastValue());
//        System.out.println(list.indexof(8));
//        System.out.println(list.contains(1));
        //level3
        list.push(3);
//        System.out.println(list.description());

//        System.out.println(list.pop());
//        System.out.println(list.description());

        list.remove(0);
//        System.out.println(list.description());

        list.insert(0,9);
//        System.out.println(list.description());

        list.replace(0,8);
//        System.out.println(list.description());

        //level5
        double[] test = {3,8,7,6,5,4};
        double[] test1 = {1,9,2};
        LinkedList list1 = new LinkedList(test);
        LinkedList list2 = new LinkedList(test1);
        System.out.println(list1.description());
        System.out.println(list2.description());

//        System.out.println(list1.subList(2,4).description());

//        list1.addAll(list);
//        System.out.println(list1.description());

//        list1.removeAll();
//        System.out.println(list1.description());

//        list1.remove(2,4);
//        System.out.println(list1.description());

//        list1.insert(2,list2);
//        System.out.println(list1.description());

        list1.replace(2,4,list2);
        System.out.println(list1.description());

        list1.sort();
        System.out.println(list1.description());

        list1.shuffle();
        System.out.println(list1.description());

    }
}
