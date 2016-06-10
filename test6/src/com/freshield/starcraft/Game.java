package com.freshield.starcraft;

/**
 * Created by FRESHIELD on 2016/6/10.
 */
public class Game {
    public void run(){

        GameMap gameMap = new GameMap();

        Unit unit;

        unit = new Stalker();
        unit.setLocation(new Point(1,1));
        gameMap.addUnit(unit);

        unit = new PhotonCanon();
        unit.setLocation(new Point(2,2));
        gameMap.addUnit(unit);

        unit = new WarpPrism();
        unit.setLocation(new Point(3,3));
        gameMap.addUnit(unit);

        unit = new Observer();
        unit.setLocation(new Point(4,4));
        gameMap.addUnit(unit);

        Rectangle section = new Rectangle(new Point(0.5,0.5),3,3);
        gameMap.selectUnitsInArea(section);

        gameMap.selectedUnitsMoveTo(new Point(5,5));



    }
}
