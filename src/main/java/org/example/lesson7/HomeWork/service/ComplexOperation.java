package org.example.lesson7.HomeWork.service;

import org.example.lesson7.HomeWork.model.Complex;
import org.example.lesson7.HomeWork.model.MyNumber;

// 3 - Liskov substitution principle - RationalOperation and ComplexOperation extends NumberOperation (CORRECTED)

public class ComplexOperation extends NumberOperation {
    private Complex number1;
    private Complex number2;
    private Complex opRes;

    public ComplexOperation() {
        this.number1 = new Complex();
        this.number2 = new Complex();
        this.opRes = new Complex();
    }

    @Override
    public void createPairOfNumbers(int num1, int num2, int num3, int num4) {
        number1 = new Complex(num1, num2);
        number2 = new Complex(num3, num4);
    }

    @Override
    public void add() {
        opRes.setA(number1.getA() + number2.getA());
        opRes.setB(number1.getB() + number2.getB());
    }

    @Override
    public void subtract() {
        opRes.setA(number1.getA() - number2.getA());
        opRes.setB(number1.getB() - number2.getB());
    }

    @Override
    public void multiply() {
        opRes.setA(number1.getA() * number2.getA() - number1.getB() * number2.getB());
        opRes.setB(number1.getA() * number2.getB() + number1.getB() * number2.getA());
    }

    @Override
    public void divide() {
        Complex res = new Complex();
        double denominator = number2.getA() * number2.getA() + number2.getB() * number2.getB();
        number2.setB(number2.getB() * (-1));
        multiply();
        opRes.setA(opRes.getA() / denominator);
        opRes.setB(opRes.getB() / denominator);
    }

    public MyNumber getNumber1() {
        return number1;
    }

    public MyNumber getNumber2() {
        return number2;
    }

    public MyNumber getOpRes() {
        return opRes;
    }
}
