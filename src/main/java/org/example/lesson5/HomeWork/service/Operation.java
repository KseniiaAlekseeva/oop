package org.example.lesson5.HomeWork.service;

import org.example.lesson5.HomeWork.model.MyNumber;
import org.example.lesson5.HomeWork.model.Type;

public interface Operation<E extends MyNumber> {
    void createPairOfNumbers(int num1, int num2, int num3, int num4, Type type);

    void add();

    void subtract();

    void multiply();

    void divide();
}
