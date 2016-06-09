package com.freshield.inheritance;

/**
 * Created by FRESHIELD on 2016/6/9.
 */
public class Dog extends Animal {
    public void bark(){
        System.out.println("Dog bark");
    }

    public void eat(){
        System.out.println("Dog eat");
        super.eat();
    }
}
