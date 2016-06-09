package com.freshield.inheritance;

/**
 * Created by FRESHIELD on 2016/6/9.
 */
public class AnimalFactory {
    public Animal createAnimal(String name){
        if (name.equals("Human")){
            return new Human();
        } else if (name.equals("Dog")){
            return new Dog();
        }
        return null;
    }
}
