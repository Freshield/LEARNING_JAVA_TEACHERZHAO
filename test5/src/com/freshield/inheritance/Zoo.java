package com.freshield.inheritance;

/**
 * Created by FRESHIELD on 2016/6/9.
 */
public class Zoo {
    public void run(){
        Animal animal = new Animal();
        animal.eat();

        Human human = new Human();
        human.eat();
        human.work();
    }
}
