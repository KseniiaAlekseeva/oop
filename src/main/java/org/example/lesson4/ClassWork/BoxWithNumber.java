package org.example.lesson4.ClassWork;

import lombok.Data;

import static java.lang.Math.abs;

@Data
public class BoxWithNumber<E extends Number> {
    private E[] num;

    public BoxWithNumber(E... num) {
        this.num = num;
    }

    public double average() {
        double sum = 0.;
        for (E e : num) {
            sum += e.doubleValue();
        }
        return sum / num.length;
    }

    public boolean compareAverage(BoxWithNumber<? extends Number> bwm2) {
        if (abs(this.average() - bwm2.average()) < 0.000001)
            return true;
        return false;
    }
}
