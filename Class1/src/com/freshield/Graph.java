package com.freshield;

/**
 * Created by FRESHIELD on 2016/5/31.
 */
public class Graph {

    public void run() {


        Circle circle = new Circle();
        Point origin = new Point(1,2);
        circle.setOrigin(origin);
        circle.setRadius(3);

        Point target = new Point(2,3);
        System.out.println(circle.hitTest(target));
    }
}
