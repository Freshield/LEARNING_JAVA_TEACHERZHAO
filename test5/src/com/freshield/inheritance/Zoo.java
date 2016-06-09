package com.freshield.inheritance;

import java.util.Scanner;

/**
 * Created by FRESHIELD on 2016/6/9.
 */
public class Zoo {
    public void run(){
//        Animal animal = new Human();
        AnimalFactory animalFactory = new AnimalFactory();
        String animalName = "";
        Scanner scanner = new Scanner(System.in);
        animalName = scanner.nextLine();

        Animal animal = animalFactory.createAnimal(animalName);
        animal.eat();
    }
}
