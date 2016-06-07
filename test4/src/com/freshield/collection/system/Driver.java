package com.freshield.collection.system;

import java.util.LinkedList;

/**
 * Created by FRESHIELD on 2016/6/7.
 */
public class Driver {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<String>();
        names.add("Xiaoming");
        names.add("XiaoHong");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        for(String name:names) {
            System.out.println(name);
        }

        int[] numbers = {2,3,4};
        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
