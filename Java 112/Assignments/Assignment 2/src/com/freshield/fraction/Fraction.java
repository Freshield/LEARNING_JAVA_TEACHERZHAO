package com.freshield.fraction;

/**
 * Created by FRESHIELD on 2016/6/2.
 */
public class Fraction {

    private int numerator;
    private int denominator;

    //constructor
    public Fraction(String string) {
        String[] got = string.split("/");
        numerator = Integer.valueOf(got[0]);
        denominator = Integer.valueOf(got[1]);
    }

    //getter and setter
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    //functions
    public String description() {
        return numerator+" / "+denominator;
    }

    public double value() {
        return (double)numerator / (double)denominator;
    }

    public void simplify() {
        int gcd = getGCD(numerator,denominator);
        numerator /= gcd;
        denominator /= gcd;

    }

    public Fraction add(Fraction fraction) {
        int resultDenominator = getLCM(denominator,fraction.getDenominator());

        int numeratorAdding = numerator * (resultDenominator / denominator);
        int numeratorAdded = fraction.numerator * (resultDenominator / fraction.denominator);
        int resultNumerator = numeratorAdding + numeratorAdded;

        Fraction result = new Fraction(resultNumerator+"/"+resultDenominator);
        return result;
    }

    public Fraction subtract(Fraction fraction) {
        return fraction;
    }

    public Fraction multiply(Fraction fraction) {
        return fraction;
    }

    public Fraction divide(Fraction fraction) {
        return fraction;
    }

    public Fraction copy() {
        return this;
    }

    public boolean equals(Fraction fraction) {
        return false;
    }

    //GCD and LCM
    public int getGCD(int num1, int num2){
        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);

        while(max % min != 0){
            int temp = max;
            max = min;
            min = temp % min;
        }

        return min;
    }

    public int getLCM(int num1, int num2){
        return num1 * num2 /getGCD(num1, num2);
    }

}
