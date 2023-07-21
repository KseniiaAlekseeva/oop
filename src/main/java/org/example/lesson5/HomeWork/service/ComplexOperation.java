package org.example.lesson5.HomeWork.service;

import org.example.lesson5.HomeWork.model.Complex;

public abstract class ComplexOperation {
    protected static Complex add(Complex num1, Complex num2) {
        Complex res = new Complex();
        res.setA(num1.getA() + num2.getA());
        res.setB(num1.getB() + num2.getB());
        return res;
    }

    protected static Complex subtract(Complex num1, Complex num2) {
        Complex res = new Complex();
        res.setA(num1.getA() - num2.getA());
        res.setB(num1.getB() - num2.getB());
        return res;
    }

    public static Complex multiply(Complex num1, Complex num2) {
        Complex res = new Complex();
        res.setA(num1.getA() * num2.getA() - num1.getB() * num2.getB());
        res.setB(num1.getA() * num2.getB() + num1.getB() * num2.getA());
        return res;
    }

    public static Complex divide(Complex num1, Complex num2) {
        Complex res = new Complex();
        Complex conjugate = new Complex(num2.getA(), num2.getB() * (-1));
        res = multiply(num1, conjugate);
        double denominator = num2.getA() * num2.getA() + num2.getB() * num2.getB();
        res.setA(res.getA() / denominator);
        res.setB(res.getB() / denominator);
        return res;
    }
}
