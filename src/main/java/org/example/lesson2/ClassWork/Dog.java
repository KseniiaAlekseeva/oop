package org.example.lesson2.ClassWork;

public class Dog extends Animal {
    protected static int count;

    public Dog(String name, String type, int maxRunDist, int maxSwimDist) {
        super(name, "Dog", maxRunDist, maxSwimDist);
        count++;
    }
}
