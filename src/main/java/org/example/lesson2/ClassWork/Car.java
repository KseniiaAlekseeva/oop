package org.example.lesson2.ClassWork;

public class Car implements Transport {
    @Override
    public void run(){
        System.out.println("Car runs.");
    }
    @Override
    public void stop(){
        System.out.println("Car stops.");
    }
}
