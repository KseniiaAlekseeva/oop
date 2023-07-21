package org.example.lesson5.HomeWork.service;

import org.example.lesson5.HomeWork.model.Rational;

public abstract class RationalOperation {
    protected static Rational add(Rational num1, Rational num2) {
        Rational res = new Rational();
        res.setM(num1.getM() * num2.getN() + num1.getN() * num2.getM());
        res.setN(num1.getN() * num2.getN());
        return simplify(res);
    }

    protected static Rational subtract(Rational num1, Rational num2) {
        Rational num = new Rational(num2.getM() * (-1), num2.getN());
        return add(num1, num);
    }

    public static Rational multiply(Rational num1, Rational num2) {
        Rational res = new Rational();
        res.setM(num1.getM() * num2.getM());
        res.setN(num1.getN() * num2.getN());
        return simplify(res);
    }

    public static Rational divide(Rational num1, Rational num2) {
        Rational res = new Rational();
        res.setM(num1.getM() * num2.getN());
        res.setN(num1.getN() * num2.getM());
        return simplify(res);
    }

    protected static Rational simplify(Rational num) {
        int gcd = gcdByEuclid(num.getM(), num.getN());
        int m = num.getM() / gcd;
        int n = num.getN() / gcd;
        if (m >= 0 & n < 0) {
            m *= -1;
            n *= -1;
        }
        return new Rational(m, n);
    }

    private static int gcdByEuclid(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclid(n2, n1 % n2);
    }
}
