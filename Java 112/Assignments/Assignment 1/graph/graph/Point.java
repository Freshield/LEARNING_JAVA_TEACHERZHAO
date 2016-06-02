package com.zhaozhepublic.graph;

/**
 * Created by Zhaozhe on 5/31/16.
 */

public class Point {
    private double x;
    private double y;

    public Point() {

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(double x, double y){
        double dx = this.x - x;
        double dy = this.y - y;
        return Math.pow(dx * dx + dy * dy, 0.5);
    }

    public double distanceTo(Point target){
        return distanceTo(target.getX(), target.getY());
    }

    public double distanceToOrigin(){
        return distanceTo(0, 0);
    }

    public void trace(){
        System.out.println(description());
    }

    public String description(){
        return "(" + x + ", " + y + ")";
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
