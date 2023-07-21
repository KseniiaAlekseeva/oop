package org.example.lesson5.HomeWork.controller;

import org.example.lesson5.ClassWork.model.OperationType;
import org.example.lesson5.HomeWork.model.Type;
import org.example.lesson5.HomeWork.service.NumberOperation;
import org.example.lesson5.HomeWork.view.Log;

import java.util.Scanner;

public class Controller {
    private final NumberOperation no = new NumberOperation();
    private final Log log = new Log();

    public void createRationalPair(int num1, int num2, int num3, int num4) {
        no.createPairOfNumbers(num1, num2, num3, num4, Type.RATIONAL);
        log.logNumber(Type.RATIONAL, no.getNum1());
        log.logNumber(Type.RATIONAL, no.getNum2());
    }

    public void createComplexPair(int num1, int num2, int num3, int num4) {
        no.createPairOfNumbers(num1, num2, num3, num4, Type.COMPLEX);
        log.logNumber(Type.COMPLEX, no.getNum1());
        log.logNumber(Type.COMPLEX, no.getNum2());
    }

    public void makeOperation() {
        System.out.println("Press 1 - add, 2 - subtract, 3 - multiply, 4 - divide: ");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        OperationType type = null;
        switch (op) {
            case 1:
                no.add();
                type = OperationType.ADD;
                break;
            case 2:
                no.subtract();
                type = OperationType.SUB;
                break;
            case 3:
                no.multiply();
                type = OperationType.MULT;
                break;
            case 4:
                no.divide();
                type = OperationType.DIV;
                break;
            default:
                makeOperation();
                break;

        }
        log.logOperation(type, no.getNum1(), no.getNum2(), no.getOpRes());
    }

}
