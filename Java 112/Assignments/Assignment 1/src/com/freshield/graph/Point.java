package com.freshield.graph;

/**
 * Created by FRESHIELD on 2016/5/31.
 */
public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
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

    public String description() {
        return "("+x+", "+y+")";
    }

    public void cross() {
        double temp = x;
        x = y;
        y = temp;
    }

    public void flip() {
        x *= -1;
        y *= -1;
    }

    public void unitize() {
        if (x != 0) {
            x = x > 0 ? 1 : -1;
        }
        if (y != 0) {
            y = y > 0 ? 1 : -1;
        }
    }

    public double distanceToOrigin() {
        return distanceTo(0,0);
    }

    public double distanceTo(double x, double y) {
        double dx = this.x - x;
        double dy = this.y - y;
        double distance = Math.pow((dx * dx + dy * dy),0.5);
        return distance;
    }

    public double distanceTo(Point target) {
        return distanceTo(target.getX(),target.getY());
    }
}
