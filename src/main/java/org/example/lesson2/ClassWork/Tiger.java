package org.example.lesson2.ClassWork;

public class Tiger extends Cat{
    protected static int count;

    public Tiger(String name, String type, int maxRunDist, int maxSwimDist) {
        super(name, type, maxRunDist, maxSwimDist);
        count++;
    }
}
