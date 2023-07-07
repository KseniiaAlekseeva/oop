package org.example.lesson2.ClassWork;

public class Cat extends Animal {
    protected static int count;
    public Cat(String name, String type, int maxRunDist, int maxSwimDist) {
        super(name, "Cat", maxRunDist, 0);
        count++;
    }
}
