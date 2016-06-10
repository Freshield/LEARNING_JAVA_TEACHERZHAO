package com.freshield.starcraft;

/**
 * Created by FRESHIELD on 2016/6/10.
 */
public class Observer extends Unit implements Moving {
    public Observer() {
        super("Observer");
    }

    @Override
    public void moveToLocation(Point location) {

        System.out.println(name + " " + this.location.description()
                + " fly to " + location.description());
        this.setLocation(location);
    }
}
