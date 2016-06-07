package com.freshield.collection;

/**
 * Created by Coco Lv on 2016-06-03.
 */
public class LinkedListTest {
    public void run(){
        LinkedList list = new LinkedList();
        LinkedList addList = new LinkedList();
        list.buildDemo();
        System.out.println("list = " + list.description());
        System.out.println("list size is " + list.size());
        System.out.println("list is empty? " + list.isEmpty());
        System.out.println(list.get(3));
        System.out.println("last value is " + list.lastValue());
        System.out.println(list.indexOf(2));
        System.out.println("list contains 10? " + list.contains(10));
        list.add(3);
        System.out.println("add" + list.description());
        list.push(5);
        System.out.println("push" + list.description());
        System.out.println("pop" + list.pop());
        System.out.println("pop list" + list.description());
        list.remove(3);
        System.out.println("remove" + list.description());
        list.insert(1,9.0);
        System.out.println("insert" + list.description());
        list.replace(5,9.0);
        System.out.println("replace" + list.description());
        list.LinkedList(new double[]{6.0,7.0,3.0,8.0,4.0});
        System.out.println(list.description());
        System.out.println("sublist" + list.subList(1,3).description());
        addList.LinkedList(new double[]{3.0,5.0});
        list.addAll(addList);
        System.out.println("addAll" + list.description());
        list.removeAll();
        System.out.println("removeAll" + list.description());
        list.LinkedList(new double[]{6.0,7.0,3.0,8.0,4.0});
        System.out.println("new list" + list.description());
        list.remove(2,3);
        System.out.println("remove from/to index" + list.description());
        list.insert(2,addList);
        System.out.println("insert list from index" + list.description());
        list.replace(0,2,addList);
        System.out.println("replace list from/to index" + list.description());




    }
}
