package org.example.lesson5.HomeWork.service;

import org.example.lesson5.HomeWork.model.Complex;
import org.example.lesson5.HomeWork.model.MyNumber;
import org.example.lesson5.HomeWork.model.Rational;
import org.example.lesson5.HomeWork.model.Type;

public class NumberOperation<E extends MyNumber> implements Operation<E> {
    private E num1;
    private E num2;
    private E opRes;

    @Override
    public void createPairOfNumbers(int num1, int num2, int num3, int num4, Type type) {
        if (type == Type.RATIONAL) {
            this.num1 = (E) (new Rational(num1, num2));
            this.num2 = (E) (new Rational(num3, num4));
        }
        if (type == Type.COMPLEX) {
            this.num1 = (E) (new Complex(num1, num2));
            this.num2 = (E) (new Complex(num3, num4));
        }
    }

    @Override
    public void add() {
        if (this.num1 instanceof Rational)
            opRes = (E) RationalOperation.add((Rational) this.num1, (Rational) this.num2);
        if (this.num1 instanceof Complex)
            opRes = (E) ComplexOperation.add((Complex) this.num1, (Complex) this.num2);
    }

    @Override
    public void subtract() {
        if (this.num1 instanceof Rational)
            opRes = (E) RationalOperation.subtract((Rational) this.num1, (Rational) this.num2);
        if (this.num1 instanceof Complex)
            opRes = (E) ComplexOperation.subtract((Complex) this.num1, (Complex) this.num2);
    }

    @Override
    public void multiply() {
        if (this.num1 instanceof Rational)
            opRes = (E) RationalOperation.multiply((Rational) this.num1, (Rational) this.num2);
        if (this.num1 instanceof Complex)
            opRes = (E) ComplexOperation.multiply((Complex) this.num1, (Complex) this.num2);
    }

    @Override
    public void divide() {
        if (this.num1 instanceof Rational)
            opRes = (E) RationalOperation.divide((Rational) this.num1, (Rational) this.num2);
        if (this.num1 instanceof Complex)
            opRes = (E) ComplexOperation.divide((Complex) this.num1, (Complex) this.num2);
    }

    public E getNum1() {
        return num1;
    }

    public E getNum2() {
        return num2;
    }

    public E getOpRes() {
        return opRes;
    }
}
