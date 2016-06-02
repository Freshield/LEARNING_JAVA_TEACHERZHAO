package com.freshield.fraction;

/**
 * Created by FRESHIELD on 2016/6/2.
 */
public class Mathematics {
    public void run() {
        Fraction fraction = new Fraction("50/100");
        Fraction fraction1 = new Fraction("3/4");
        System.out.println(fraction.description());
        fraction.simplify();
        System.out.println(fraction.description());
        System.out.println(fraction.add(fraction1).description());
    }
}
