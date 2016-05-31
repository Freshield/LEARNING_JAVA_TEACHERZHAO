package com.freshield;

/**
 * Created by FRESHIELD on 2016/5/31.
 */
public class Point {

    public double x;
    public double y;

    public void trace() {
        System.out.println("(" + x + ", " + y + ")");
    }

    public String description() {
        return "(" + x + ", " + y+")";
    }

}
