package org.example.lesson7.HomeWork.view;

import org.example.lesson7.HomeWork.model.MyNumber;
import org.example.lesson7.HomeWork.model.OperationType;
import org.example.lesson7.HomeWork.service.NumberOperation;

public class Log {
    public void logOperation(OperationType opType, NumberOperation no) {
        switch (opType) {
            case ADD:
                System.out.println("ADDITION: " + no.getNumber1().toString() + " + " + no.getNumber2().toString() + " = " + no.getOpRes().toString());
                break;
            case SUB:
                System.out.println("SUBTRACTION: " + no.getNumber1().toString() + " - " + no.getNumber2().toString() + " = " + no.getOpRes().toString());
                break;
            case MULT:
                System.out.println("MULTIPLICATION: " + no.getNumber1().toString() + " * " + no.getNumber2().toString() + " = " + no.getOpRes().toString());
                break;
            case DIV:
                System.out.println("DIVISION: " + no.getNumber1().toString() + " / " + no.getNumber2().toString() + " = " + no.getOpRes().toString());
                break;
            default:
                break;
        }
    }

    public void logNumber(MyNumber num1) {
        System.out.println("CREATE complex number: " + num1.toString());
    }
}
