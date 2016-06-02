package com.zhaozhepublic.graph;

/**
 * Created by Zhaozhe on 6/2/16.
 */
public class Rectangle {
    private Point origin;
    private double width;
    private double height;

    public Rectangle() {
        
    }

    public Rectangle(Point origin, double width, double height) {
        this.origin = origin;
        this.width = width;
        this.height = height;
    }

    public double area(){
        return width * height;
    }

    public boolean hitTest(Point point){

        boolean hTest = point.getX() > origin.getX() && point.getX() < origin.getX() + width;
        boolean vTest = point.getY() > origin.getY() && point.getY() < origin.getY() + height;
        return hTest && vTest;
    }

    public Point getOrigin() {
        return origin;
    }
    public void setOrigin(Point origin) {
        this.origin = origin;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

}
