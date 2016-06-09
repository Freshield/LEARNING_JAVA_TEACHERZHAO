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

        System.out.println("");
        Animal animal1 = new Human();
        animal1.eat();

        System.out.println("");
        Animal ah = new Human();
        Animal ad = new Dog();

        ah.eat();
        ad.eat();
    }
}
