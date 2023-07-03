package org.example.lesson1.ClassWork;

public class Ex1 {
    public static void main(String[] args) {
        //Cat cat1 = new Cat();
        Cat cat1 = new Cat("barsik", "color", 21);
        cat1.setAge(-5);
        cat1.setAge(10);
        cat1.animalInfo();
        cat1.voice();
        cat1.jump();
    }
}
