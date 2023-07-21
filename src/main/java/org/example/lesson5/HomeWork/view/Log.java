package org.example.lesson5.HomeWork.view;

import org.example.lesson5.ClassWork.model.OperationType;
import org.example.lesson5.HomeWork.model.MyNumber;
import org.example.lesson5.HomeWork.model.Type;

public class Log {
    public void logOperation(OperationType type, MyNumber num1, MyNumber num2, MyNumber res) {
        switch (type) {
            case ADD:
                System.out.println("ADDITION: " + num1.toString() + " + " + num2.toString() + " = " + res.toString());
                break;
            case SUB:
                System.out.println("SUBTRACTION: " + num1.toString() + " - " + num2.toString() + " = " + res.toString());
                break;
            case MULT:
                System.out.println("MULTIPLICATION: " + num1.toString() + " * " + num2.toString() + " = " + res.toString());
                break;
            case DIV:
                System.out.println("DIVISION: " + num1.toString() + " / " + num2.toString() + " = " + res.toString());
                break;
            default:
                break;
        }
    }

    public void logNumber(Type type, MyNumber num1) {
        System.out.println("CREATE " + type + " number: " + num1.toString());
    }
}
