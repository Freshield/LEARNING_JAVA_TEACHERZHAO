package com.freshield;

/**
 * Created by FRESHIELD on 2016/5/31.
 */
public class Circle {

    private double radius;
    private Point origin;



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getOrigin() {
        return origin;
    }

    public void setOrigin(Point origin) {
        this.origin = origin;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public boolean hitTest(Point target) {
        double dx = target.getX() - origin.getX();
        double dy = target.getY() - origin.getY();
        double distance = Math.pow((dx * dx + dy * dy),0.5);
        return (distance <= radius);
    }
}
