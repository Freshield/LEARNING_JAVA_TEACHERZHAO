package com.freshield.OfficeStory;

/**
 * Created by FRESHIELD on 2016/6/14.
 */
public class BathroomMachine implements ProgrammerDelegate{

    private Bathroom bathroom;

    public BathroomMachine() {
    }

    public BathroomMachine(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    //getter setter
    public Bathroom getBathroom() {
        return bathroom;
    }

    public void setBathroom(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    public Bathroom requestForBathromm(Programmer programmer){
        System.out.println("BathroomMachine:Name is " + programmer.getName() + " go to bathroom");
        return bathroom;
    }
}
