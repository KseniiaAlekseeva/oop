package org.example.lesson2.ClassWork;

public class Skate implements Transport {
    @Override
    public void stop() {
        System.out.println("Skate stops.");
    }
    @Override
    public void run() {
        System.out.println("Skate runs.");
    }
}
