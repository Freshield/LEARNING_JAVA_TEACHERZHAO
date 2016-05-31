package com.freshield;

/**
 * Created by FRESHIELD on 2016/5/31.
 */
public class Graph {

    public void run() {

        Point point = new Point();
        point.setX(2);
        point.setY(3);
        System.out.println("(" + point.getX() + ", " + point.getY() + ")");

        point.trace();
        System.out.println(point.description());
    }
}
