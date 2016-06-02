package com.freshield.fraction;

/**
 * Created by FRESHIELD on 2016/6/2.
 */
public class Mathematics {
    public void run() {
        Fraction fraction = new Fraction("2/5");
        Fraction fraction1 = new Fraction("3/4");
        Fraction fraction2 = new Fraction("4/10");

        System.out.println(fraction.description());
        fraction.simplify();
        System.out.println(fraction.description());
        System.out.println(fraction.add(fraction1).description());
        System.out.println(fraction.subtract(fraction1).description());
        System.out.println(fraction.multiply(fraction1).description());
        System.out.println(fraction.divide(fraction1).description());
        System.out.println(fraction.equals(fraction1));
        System.out.println(fraction.equals(fraction2));
    }
}
