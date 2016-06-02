package com.zhaozhepublic.graph;

/**
 * Created by Zhaozhe on 5/31/16.
 */
public class Circle {

    private Point origin;
    private double radius;

    public Circle() {

    }

    public Circle(Point origin, double radius) {
        this.origin = origin;
        this.radius = radius;
    }

    public double area(){
        return Math.PI * radius * radius;
    }

    public boolean hitTest(Point point){
        double centerX = origin.getX() + radius;
        double centerY = origin.getY() + radius;
        return point.distanceTo(centerX, centerY) < radius;
    }

    public Point getOrigin() {
        return origin;
    }

    public void setOrigin(Point origin) {
        this.origin = origin;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
