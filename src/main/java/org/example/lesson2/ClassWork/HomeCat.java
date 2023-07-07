package org.example.lesson2.ClassWork;

public class HomeCat extends Cat {
    protected static int count;

    public HomeCat(String name, String type, int maxRunDist, int maxSwimDist) {
        super(name, type, maxRunDist, maxSwimDist);
        count++;
    }
}
