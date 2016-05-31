package com.freshield;

/**
 * Created by FRESHIELD on 2016/5/31.
 */
public class Point {

    private double x;
    private double y;

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

    public void trace() {
        System.out.println("(" + x + ", " + y + ")");
    }

    public String description() {
        return "(" + x + ", " + y+")";
    }

}
