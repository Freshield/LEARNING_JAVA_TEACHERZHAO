package com.freshield.graph;

/**
 * Created by FRESHIELD on 2016/5/31.
 */
public class Graph {

    public void run() {

        System.out.println("Point:");
        Point point = new Point(3,4);
        Point point1 = new Point(-4,-1);
        point.cross();
        point.flip();
//        point.unitize();
        System.out.println(point.description());
        System.out.println(point.distanceToOrigin());
        System.out.println(point.distanceTo(-4,0));
        System.out.println(point.distanceTo(point1));

        System.out.println("Circle:");
        Circle circle = new Circle(point,3);
        System.out.println(circle.hitTest(point1));
        System.out.println(circle.area());
        System.out.println(circle.perimeter());

        System.out.println("Rectangle:");
        Rectangle rectangle = new Rectangle(point,4,4);
        System.out.println(rectangle.hitTest(point1));
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());


    }

    public void run2() {

        Point p1 = new Point(3,4);
        Point p2 = new Point(6,5);
        Point p3 = new Point(8,2);
        Point p4 = new Point(12,4);
        Point p5 = new Point(14,6);

        Circle circle = new Circle(p1,2);
        Rectangle rectangle = new Rectangle(p4,10,4);

        System.out.println("Circle hitTest:");
        System.out.println("p2 test: " + circle.hitTest(p2));
        System.out.println("p3 test: " + circle.hitTest(p3));
        System.out.println("p5 test: " + circle.hitTest(p5));

        System.out.println("Rectangle hitTest:");
        System.out.println("p2 test: " + rectangle.hitTest(p2));
        System.out.println("p3 test: " + rectangle.hitTest(p3));
        System.out.println("p5 test: " + rectangle.hitTest(p5));

        System.out.println("Circle area is "+circle.area()+", perimeter is "+circle.perimeter());
        System.out.println("Rectangle area is "+rectangle.area()+", perimeter is "+rectangle.perimeter());


    }
}
