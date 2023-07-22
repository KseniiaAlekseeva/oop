package org.example.lesson6.HomeWork.service;

// 5 - dependency inversion principle -
// NumberOperation implements interface Operation (NOT CORRECTED)
// made NumberOperation as abstract class (CORRECTED),
// Complex and RationalOperation extends Number Operation and realise methods (CORRECTED)
public abstract class NumberOperation implements ArithmeticOperation {
    @Override
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
