package org.example.lesson7.HomeWork.controller;

import org.example.lesson7.HomeWork.model.OperationType;
import org.example.lesson7.HomeWork.model.Type;
import org.example.lesson7.HomeWork.service.ComplexOperation;
import org.example.lesson7.HomeWork.service.NumberOperation;
import org.example.lesson7.HomeWork.service.RationalOperation;
import org.example.lesson7.HomeWork.view.Log;

import java.util.Scanner;

public class Controller {
    private final RationalOperation ro = new RationalOperation();
    private final ComplexOperation co = new ComplexOperation();
    private final Log log = new Log();

    /**
     * @param num1 m for first ration number m/n
     * @param num2 n for first ration number m/n
     * @param num3 m for second ration number m/n
     * @param num4 n for second ration number m/n
     * @apiNote Create the pair of rational numbers
     */
    public void createRationalPair(int num1, int num2, int num3, int num4) {
        ro.createPairOfNumbers(num1, num2, num3, num4);
        log.logNumber(ro.getNumber1());
        log.logNumber(ro.getNumber2());
    }

    /**
     * @param num1 m for first complex number m/n
     * @param num2 n for first complex number m/n
     * @param num3 m for second complex number m/n
     * @param num4 n for second complex number m/n
     * @apiNote Create the pair of complex numbers
     */
    public void createComplexPair(int num1, int num2, int num3, int num4) {
        co.createPairOfNumbers(num1, num2, num3, num4);
        log.logNumber(co.getNumber1());
        log.logNumber(co.getNumber2());
    }

    /**
     * @apiNote Start operation for rational numbers
     */
    public void makeRationalOperation() {
        makeOperation(Type.RATIONAL);
    }

    /**
     * @apiNote Start operation for complex numbers
     */
    public void makeComplexOperation() {
        makeOperation(Type.COMPLEX);
    }

    /**
     * @param type Type of arithmetic operation: adding, subtracting, multiplication, division
     * @apiNote Make some operation between numbers
     */
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
        log.logOperation(opType, no);
    }

}
