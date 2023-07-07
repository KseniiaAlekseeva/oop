package org.example.lesson2.ClassWork;

public class Bicycle implements Transport {
    @Override
    public void stop() {
        System.out.println("Bicycle stops.");
    }
    @Override
    public void run() {
        System.out.println("Bicycle runs.");
    }
}
