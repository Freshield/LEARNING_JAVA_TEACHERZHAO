package com.zhaozhepublic.collection.system;

import java.util.LinkedList;

/**
 * Created by Zhaozhe on 6/7/16.
 */
public class Driver {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<String>();
        names.add("Xiaoming");
        names.add("Xiaohong");

        for(int i = 0; i < names.size(); i++){
            String name = names.get(i);
            System.out.println(name);
        }

        for(String name : names){
            System.out.println(name);
        }

        int[] numbers = {2, 3, 4};
        for (int number : numbers) {
            System.out.println(number);
        }


//        LinkedList<IntWrapper> intValues = new LinkedList<IntWrapper>();
//        intValues.add(new IntWrapper(3));
//
//        for (IntWrapper intValue : intValues) {
//            System.out.println(intValue.getValue());
//        }

        LinkedList<Integer> intValues = new LinkedList<Integer>();
        intValues.add(3);

        for (int intValue : intValues) {
            System.out.println(intValue);
        }

    }
}
