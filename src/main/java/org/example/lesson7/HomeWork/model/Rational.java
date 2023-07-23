package org.example.lesson7.HomeWork.model;

// 1 - single responsibility principle (NOT CORRECTED)

// 3 - Liskov substitution principle - Rational and Complex extends MyNumber (NOT CORRECTED)


public class Rational extends MyNumber {
    int m;
    int n;

    public Rational(int m, int n) {
        super(Type.RATIONAL);
        if (m >= 0 & n < 0) {
            m *= -1;
            n *= -1;
        }
        this.m = m;
        this.n = n;
    }

    public Rational() {
        super(Type.RATIONAL);
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return String.valueOf(m) + "/" + String.valueOf(n);
    }
}
