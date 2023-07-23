package org.example.lesson7.HomeWork.service;

import org.example.lesson7.HomeWork.model.MyNumber;
import org.example.lesson7.HomeWork.model.Rational;

// 5 - dependency inversion principle -
// NumberOperation implements interface Operation (NOT CORRECTED)
// made NumberOperation as abstract class (CORRECTED),
// Complex and RationalOperation extends Number Operation and realise methods (CORRECTED)
public abstract class NumberOperation implements ArithmeticOperation {

    public abstract MyNumber getNumber1();

    public abstract MyNumber getNumber2();

    public abstract MyNumber getOpRes();
    public void createPairOfNumbers(int num1, int num2, int num3, int num4) {

    }

    @Override
    public void add() {

    }

    @Override
    public void subtract() {

    }

    @Override
    public void multiply() {

    }

    @Override
    public void divide() {

    }
}
