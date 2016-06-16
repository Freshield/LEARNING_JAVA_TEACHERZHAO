package com.freshield.OfficeStory;

/**
 * Created by FRESHIELD on 2016/6/14.
 */
public class Programmer {
    private Manager manager;
    private int capacity = 10;
    private int cups = 0;
    private String name;
    private BathroomMachine bathroomMachine;
    private ProgrammerDelegate programmerDelegate;

    //constructor


    public Programmer() {

    }

    public Programmer(ProgrammerDelegate programmerDelegate, String name) {
        this.programmerDelegate = programmerDelegate;
        this.name = name;
    }

    //getter setter

    public BathroomMachine getBathroomMachine() {
        return bathroomMachine;
    }

    public void setBathroomMachine(BathroomMachine bathroomMachine) {
        this.bathroomMachine = bathroomMachine;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void drink(int cups){
        this.cups += cups;
        System.out.println("Programmer:Name is " + name + " drink " + cups + " cups");
        if (this.cups >= capacity){
            Bathroom bathroom = programmerDelegate.requestForBathromm(this);
            bathroom.use(this);
        }

    }

}
