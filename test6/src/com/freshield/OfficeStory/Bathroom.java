package com.freshield.OfficeStory;

/**
 * Created by FRESHIELD on 2016/6/14.
 */
public class Bathroom {

    public void use(Programmer programmer){
        System.out.println("Bathroom:Name is " + programmer.getName() + " using bathroom");
        programmer.setCups(0);

    }
}
