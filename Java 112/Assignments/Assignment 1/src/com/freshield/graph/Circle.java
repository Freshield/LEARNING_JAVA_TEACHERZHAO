package com.freshield.graph;

/**
 * Created by FRESHIELD on 2016/5/31.
 */
public class Circle {

    private Point origin;
    private double radius;

    public boolean hitTest(Point target) {
        return (target.distanceTo(origin) < radius);
    }

    public double area() {
        return radius * radius * Math.PI;
    }

    public double perimeter() {
        return 2 * radius * Math.PI;
    }
    
}
