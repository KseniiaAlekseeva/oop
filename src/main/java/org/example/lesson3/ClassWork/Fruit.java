package org.example.lesson3.ClassWork;

public enum Fruit {
    APPLE(100), ORANGE(200), MANGO(300);
    private final int calory;

    Fruit(int calory) {
        this.calory = calory;
    }

    public int getCalory() {
        return calory;
    }
}
