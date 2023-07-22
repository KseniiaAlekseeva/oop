package org.example.lesson6.HomeWork;

import org.example.lesson6.HomeWork.controller.Controller;

public class Ex {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createRationalPair(4, -8, 2, 5);
        controller.makeRationalOperation();
        controller.makeRationalOperation();
        controller.makeRationalOperation();
        controller.makeRationalOperation();


        controller.createComplexPair(4, -8, 2, 5);
        controller.makeComplexOperation();
        controller.makeComplexOperation();
        controller.makeComplexOperation();
        controller.makeComplexOperation();
    }
}
