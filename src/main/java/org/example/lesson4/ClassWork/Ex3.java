package org.example.lesson4.ClassWork;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        List<Double> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i <= 100; i+=50) {
            list.add((double) i);
            list2.add(i);
        }
        System.out.println("calc.sum(list) = " + calc.sum(list));
        System.out.println("calc.sum(list2) = " + calc.sum(list2));

        System.out.println("calc.multiply = " + calc.multiply(1, 2));
        System.out.println("calc.multiply = " + calc.multiply(1, 2.79));
        System.out.println("calc.divide = " + calc.divide(1, 2));
        System.out.println("calc.divide = " + calc.divide(1, 2.79));
        System.out.println("calc.divide = " + calc.divide(1, 0));
        System.out.println("calc.divide = " + calc.divide(1, 1e-7));

        System.out.println("calc.toBinary() = " + calc.toBinary(2, 5));
        System.out.println("calc.toBinary() = " + calc.toBinary(2.0, 5));
        System.out.println("calc.toBinary() = " + calc.toBinary(2.12, 5));
        System.out.println("calc.toBinary() = " + calc.toBinary(2.12, 3));

        System.out.println("calc.toBinary() = " + calc.toBinary("2.12", 5));


    }
}
