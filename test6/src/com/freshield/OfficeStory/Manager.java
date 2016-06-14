package com.freshield.OfficeStory;

/**
 * Created by FRESHIELD on 2016/6/14.
 */
public class Manager {
    private Bathroom bathroom;

    //constructor
    public Manager() {
    }

    public Manager(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    //getter setter
    public Bathroom getBathroom() {
        return bathroom;
    }

    public void setBathroom(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    public Bathroom requesForBathroom(Programmer programmer){
        System.out.println("Manager:Name is " + programmer.getName() + " go to bathroom");
        return bathroom;
    }
}
