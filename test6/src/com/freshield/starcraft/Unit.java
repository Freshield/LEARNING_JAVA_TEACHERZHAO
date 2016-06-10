package com.freshield.starcraft;

/**
 * Created by FRESHIELD on 2016/6/10.
 */
public class Unit {
    protected Point location;
    protected String name;

    protected boolean selected;

    public Unit(String name){
        this.name = name;
    }

    public Unit() {
        this.name = "Unknown";
    }

    //getter setter
    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

}
