package com.freshield.starcraft;

/**
 * Created by FRESHIELD on 2016/6/10.
 */
public class Stalker extends Unit implements Moving, Attacking {
    public Stalker(){
        super("Stalker");
    }



    @Override
    public void attack(Unit target) {

    }

    @Override
    public void moveToLocation(Point location) {


        System.out.println(name + " " + this.location.description()
                + " move to " + location.description());
        this.setLocation(location);
    }
}
