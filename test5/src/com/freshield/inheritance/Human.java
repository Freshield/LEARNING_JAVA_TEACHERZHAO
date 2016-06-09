package com.freshield.inheritance;

/**
 * Created by FRESHIELD on 2016/6/9.
 */
public class Human extends Animal {
    public double balance;
    public void work(){
        System.out.println("Human work");
    }
    public void eat(){
        System.out.println("Human eat");
        super.eat();
    }
}
