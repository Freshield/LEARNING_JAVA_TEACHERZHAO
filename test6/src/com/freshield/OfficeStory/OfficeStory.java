package com.freshield.OfficeStory;

/**
 * Created by FRESHIELD on 2016/6/14.
 */
public class OfficeStory {
    public void run(){

        Bathroom bathroom = new Bathroom();
        Manager manager = new Manager(bathroom);
        BathroomMachine bathroomMachine = new BathroomMachine(bathroom);
        Programmer programmer1 = new Programmer(bathroomMachine,"programmer1");
        Programmer programmer2 = new Programmer(bathroomMachine,"programmer2");


        for (int i = 0; i < 10; i++){
            System.out.println("Loop " + i);
            programmer1.drink((int)(Math.random() * 5 + 1));
            programmer2.drink((int)(Math.random() * 5 + 1));
            System.out.println();

        }
    }
}
