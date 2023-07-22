package org.example.lesson6.HomeWork.controller;

import org.example.lesson6.HomeWork.model.OperationType;
import org.example.lesson6.HomeWork.model.Type;
import org.example.lesson6.HomeWork.service.ComplexOperation;
import org.example.lesson6.HomeWork.service.NumberOperation;
import org.example.lesson6.HomeWork.service.RationalOperation;
import org.example.lesson6.HomeWork.view.Log;

import java.util.Scanner;

public class Controller {
    private final RationalOperation ro = new RationalOperation();
    private final ComplexOperation co = new ComplexOperation();
    private final Log log = new Log();

    public void createRationalPair(int num1, int num2, int num3, int num4) {
        ro.createPairOfNumbers(num1, num2, num3, num4);
        log.logNumber(ro.getNumber1());
        log.logNumber(ro.getNumber2());
    }

    public void createComplexPair(int num1, int num2, int num3, int num4) {
        co.createPairOfNumbers(num1, num2, num3, num4);
        log.logNumber(co.getNumber1());
        log.logNumber(co.getNumber2());
    }

    public void makeRationalOperation(){
        makeOperation(Type.RATIONAL);
    }

    public void makeComplexOperation(){
        makeOperation(Type.COMPLEX);
    }

    public void makeOperation(Type type) {
        NumberOperation no;
        if (type == Type.RATIONAL)
            no = (NumberOperation) ro;
        else
            no = (NumberOperation) co;

        System.out.println("Press 1 - add, 2 - subtract, 3 - multiply, 4 - divide: ");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        OperationType opType = null;

        switch (op) {
            case 1:
                no.add();
                opType = OperationType.ADD;
                break;
            case 2:
                no.subtract();
                opType = OperationType.SUB;
                break;
            case 3:
                no.multiply();
                opType = OperationType.MULT;
                break;
            case 4:
                no.divide();
                opType = OperationType.DIV;
                break;
            default:
                makeOperation(type);
                break;

        }
        if (type == Type.RATIONAL)
            log.logOperation(opType,ro.getNumber1(), ro.getNumber2(), ro.getOpRes());
        else
            log.logOperation(opType,co.getNumber1(), co.getNumber2(), co.getOpRes());
    }

}
