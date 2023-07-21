package org.example.lesson5.HomeWork.model;

public class Complex extends MyNumber {
    double a;
    double b;

    public Complex(double a, double b) {
        super(Type.COMPLEX);
        this.a = a;
        this.b = b;
    }

    public Complex() {
        super(Type.COMPLEX);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "(" + String.valueOf(a) + "; " + String.valueOf(b) + "i)";
    }
}
