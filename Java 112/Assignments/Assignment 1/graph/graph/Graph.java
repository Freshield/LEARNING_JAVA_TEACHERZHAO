package com.zhaozhepublic.graph;

/**
 * Created by Zhaozhe on 5/31/16.
 */
public class Graph {
    public void run(){
        Point p1 = new Point(3,4);
        Point p2 = new Point(4,5);
        Point p3 = new Point(12,3);
        Point p4 = new Point(13,4);
        Point p5 = new Point(15,6);

        Circle c = new Circle(p1, 2);
        Rectangle r = new Rectangle(p4, 8, 4);

        System.out.println("c a:" + c.area());
        System.out.println("r a:" + r.area());
        
        boolean a = r.hitTest(p2);
        
        System.out.println("p2" + (c.hitTest(p2) ? " is " : " is not ") + "in c");



    }
}
