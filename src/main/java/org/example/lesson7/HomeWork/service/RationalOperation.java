package org.example.lesson7.HomeWork.service;

import org.example.lesson7.HomeWork.model.Rational;// 1 - single responsibility principle (NOT CORRECTED)

// 3 - Liskov substitution principle - RationalOperation and ComplexOperation extends NumberOperation (CORRECTED)

public class RationalOperation extends NumberOperation {
    private Rational number1;
    private Rational number2;
    private Rational opRes;

    public RationalOperation() {
        this.number1 = new Rational();
        this.number2 = new Rational();
        this.opRes = new Rational();
    }

    @Override
    public void createPairOfNumbers(int num1, int num2, int num3, int num4) {
        number1 = new Rational(num1, num2);
        number2 = new Rational(num3, num4);
    }
    @Override
    public void add() {
        opRes.setM(number1.getM() * number2.getN() + number1.getN() * number2.getM());
        opRes.setN(number1.getN() * number2.getN());
        opRes = simplify(opRes);
    }
    @Override
    public void subtract() {
        number2 = new Rational(number2.getM() * (-1), number2.getN());
        add();
    }
    @Override
    public void multiply() {
        opRes.setM(number1.getM() * number2.getM());
        opRes.setN(number1.getN() * number2.getN());
        opRes = simplify(opRes);
    }
    @Override
    public void divide() {
        opRes.setM(number1.getM() * number2.getN());
        opRes.setN(number1.getN() * number2.getM());
        opRes = simplify(opRes);
    }

    public Rational simplify(Rational num) {
        int gcd = gcdByEuclid(num.getM(), num.getN());
        int m = num.getM() / gcd;
        int n = num.getN() / gcd;
        if (m >= 0 & n < 0) {
            m *= -1;
            n *= -1;
        }
        return new Rational(m, n);
    }

    private int gcdByEuclid(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclid(n2, n1 % n2);
    }

    public Rational getNumber1() {
        return number1;
    }

    public Rational getNumber2() {
        return number2;
    }

    public Rational getOpRes() {
        return opRes;
    }
}
