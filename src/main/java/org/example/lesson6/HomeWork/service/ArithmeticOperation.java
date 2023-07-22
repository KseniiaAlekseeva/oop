package org.example.lesson6.HomeWork.service;

// 4 - Interface Segregation Principle
// I think I don't need to segregate interface Operation in this task
// We can do this if, for example, it will be ArithmeticOperation interface for MyNumbers
// and BooleanOperation Interface for Sets for example
// ADD BooleanInterface only for example (CORRECTED)

// 2 - Open Closed Principle - add interface ArithmeticOperation
// and extends its methods in classes RationalOperation and ComplexOperation (NOT CORRECTED)
public interface ArithmeticOperation {
    void createPairOfNumbers(int num1, int num2, int num3, int num4);
    void add();

    void subtract();

    void multiply();

    void divide();
}
