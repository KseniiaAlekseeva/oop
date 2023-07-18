package org.example.lesson4.ClassWork;

import java.util.List;

import static java.lang.Math.abs;

public class Calculator<E extends Number> {
    /**
     * @param list Array of numbers
     * @return Sum of elements of array
     * @apiNote Calculate sum of array elements
     */
    public Double sum(List<? extends Number> list) {
        Double res = 0.0;
        for (Number number : list) {
            res += number.doubleValue();
        }
        return res;
    }

    public Double multiply(E num1, E num2) {
        return num1.doubleValue() * num2.doubleValue();
    }

    public Double divide(E num1, E num2) {
        if (abs(num2.doubleValue()) < 1e-6) {
            System.out.println("Division to zero!");
            return null;
        }
        return num1.doubleValue() / num2.doubleValue();

    }

    public String toBinary(E num, int precision) {
        Long ceilPart = num.longValue();
        return ceilToBinary(ceilPart) + '.' + fractionalToBinary(num.doubleValue() - ceilPart, precision);
    }

    public String toBinary(String num, int precision) {
        Double doubleNum = Double.parseDouble(num);
        return toBinary((E) doubleNum, precision);
    }

    private String ceilToBinary(Long num) {
        return Long.toBinaryString(num);
    }

    private String fractionalToBinary(double num, int precision) {
        StringBuilder binary = new StringBuilder();
        while (num > 0 && binary.length() < precision) {
            double r = num * 2;
            if (r >= 1) {
                binary.append(1);
                num = r - 1;
            } else {
                binary.append(0);
                num = r;
            }
        }
        return binary.toString();
    }
}
