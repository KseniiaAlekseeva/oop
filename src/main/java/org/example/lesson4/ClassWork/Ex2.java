package org.example.lesson4.ClassWork;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        BoxWithNumber<Double> bwm1 = new BoxWithNumber(1,2,3,6,1,2);
        BoxWithNumber<Integer> bwm2 = new BoxWithNumber(1,2,3,6,1,2);
        System.out.println("bwm1.average() = " + bwm1.average());
        System.out.println("bwm1.average() = " + bwm2.average());

        System.out.println("bwm1.compareAverage(bwm2) = " + bwm1.compareAverage(bwm2));
    }
}
