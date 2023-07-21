package org.example.lesson5.HomeWork;

import org.example.lesson5.HomeWork.controller.Controller;

public class Ex {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createRationalPair(4, -8, 2, 5);
        controller.makeOperation();
        controller.makeOperation();
        controller.makeOperation();
        controller.makeOperation();

        controller.createComplexPair(4, -8, 2, 5);
        controller.makeOperation();
        controller.makeOperation();
        controller.makeOperation();
        controller.makeOperation();

    }
}
