package org.example.lesson2.ClassWork;

public class Ex2 {
    public static void main(String[] args) {
        Human human = new Human();
        Bicycle bicycle = new Bicycle();
        human.stop();
        human.drive(bicycle);
        human.stop();
    }
}
