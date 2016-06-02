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
        int resultDenominator = getLCM(denominator,fraction.getDenominator());

        int numeratorAdding = numerator * (resultDenominator / denominator);
        int numeratorAdded = fraction.numerator * (resultDenominator / fraction.denominator);
        int resultNumerator = numeratorAdding - numeratorAdded;

        Fraction result = new Fraction(resultNumerator+"/"+resultDenominator);
        return result;
    }

    public Fraction multiply(Fraction fraction) {
        int resultNumberator = numerator * fraction.numerator;
        int resultDenominator = denominator * fraction.denominator;

        Fraction result = new Fraction(resultNumberator+"/"+resultDenominator);
        result.simplify();
        return result;
    }

    public Fraction divide(Fraction fraction) {
        int resultNumberator = numerator * fraction.denominator;
        int resultDenominator = denominator * fraction.numerator;

        Fraction result = new Fraction(resultNumberator+"/"+resultDenominator);
        result.simplify();
        return result;
    }

    public Fraction copy() {
        Fraction fraction = new Fraction(numerator+"/"+denominator);
        return fraction;
    }

    public boolean equals(Fraction fraction) {
        this.simplify();
        fraction.simplify();

        return (numerator == fraction.numerator && denominator == fraction.denominator) ? true : false;

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
