package com.freshield.agreement;

/**
 * Created by FRESHIELD on 2016/6/10.
 */
public class Human extends Animal implements Calculate{
    public void work(){
        System.out.println("Human work()");
    }

    public void calculate(){
        System.out.println("Human calculate()");
    }
}
