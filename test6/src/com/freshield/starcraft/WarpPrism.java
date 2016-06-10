package com.freshield.starcraft;

import java.util.LinkedList;

/**
 * Created by FRESHIELD on 2016/6/10.
 */
public class WarpPrism extends Unit implements Moving, Carrying {
    public WarpPrism() {
        super("WarpPrism");
    }

    private LinkedList<Unit> carryingUnits;

    //getter setter
    public LinkedList<Unit> getCarryingUnits() {
        return carryingUnits;
    }

    public void setCarryingUnits(LinkedList<Unit> carryingUnits) {
        this.carryingUnits = carryingUnits;
    }

    @Override
    public void pickUp(Unit unit) {

    }

    @Override
    public void dropOff(Unit unit) {

    }

    @Override
    public int capacity() {
        return 0;
    }

    @Override
    public int numberOfUnits() {
        return 0;
    }

    @Override
    public void moveToLocation(Point location) {

        System.out.println(name + " " + this.location.description()
                + " slow fly to " + location.description());
        this.setLocation(location);
    }


}
