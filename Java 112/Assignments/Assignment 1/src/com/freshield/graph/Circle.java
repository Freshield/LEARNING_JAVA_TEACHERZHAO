package com.freshield.graph;

/**
 * Created by FRESHIELD on 2016/5/31.
 */
public class Circle {

    private Point origin;
    private Point heart;
    private double radius;

    public Circle(Point origin, double radius) {
        this.origin = origin;
        heart = new Point(origin.getX() + radius,origin.getY() + radius);
        this.radius = radius;
    }

    public boolean hitTest(Point target) {
        return (target.distanceTo(heart) < radius);
    }

    public double area() {
        return radius * radius * Math.PI;
    }

    public double perimeter() {
        return 2 * radius * Math.PI;
    }

}
