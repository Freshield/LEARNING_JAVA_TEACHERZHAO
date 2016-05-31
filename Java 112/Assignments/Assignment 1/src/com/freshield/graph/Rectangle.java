package com.freshield.graph;

/**
 * Created by FRESHIELD on 2016/5/31.
 */
public class Rectangle {

    private Point origin;
    private double width;
    private double height;

    public Rectangle(Point origin, double width, double height) {
        this.origin = origin;
        this.width = width;
        this.height = height;
    }

    public boolean hitTest(Point target) {
        boolean result = false;
        double dx = target.getX() - origin.getX();
        double dy = target.getY() - origin.getY();

        if ((dx > 0 && dx < width) && (dy > 0 && dy < height)) {
            result = true;
        }

        return result;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }
}
