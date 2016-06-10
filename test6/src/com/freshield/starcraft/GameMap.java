package com.freshield.starcraft;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by FRESHIELD on 2016/6/10.
 */
public class GameMap {
    private LinkedList<Unit> units = new LinkedList<Unit>();


    //function
    public void addUnit(Unit unit){
        units.add(unit);
    }

    public void selectUnitsInArea(Rectangle section){

        for (Unit unit : units) {
            Point location = unit.getLocation();
            boolean inSection = section.hitTest(location);
            unit.setSelected(inSection);
            if (inSection){
                String message = unit.getName() + " " + location.description() + " selected";
                System.out.println(message);
            }

        }
    }

    public void selectedUnitsMoveTo(Point location){

        for (Unit unit : units) {
            if (unit.isSelected()){
                if (unit instanceof Moving){
                    Moving moving = (Moving) unit;
                    moving.moveToLocation(location);
                }
            }
        }
    }

    public void selectedUnitsAttackTo(Unit target){

    }

}
