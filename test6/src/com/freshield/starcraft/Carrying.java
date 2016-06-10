package com.freshield.starcraft;

/**
 * Created by FRESHIELD on 2016/6/10.
 */
public interface Carrying {
    public void pickUp(Unit unit);
    public void dropOff(Unit unit);
    public int capacity();
    public int numberOfUnits();
}
