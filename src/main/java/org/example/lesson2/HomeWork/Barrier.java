package org.example.lesson2.HomeWork;

public abstract class Barrier {
    protected int id;
    public static int count = 0;

    public Barrier() {
        count++;
        this.id = Integer.parseInt("999" + Integer.toString(count));
    }
}
