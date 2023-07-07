package org.example.lesson2.HomeWork;

public class Ex1 {
    public static void main(String[] args) {
        Sportsman[] sportsmen = {
                new Human("Lisa", 100, 15),
                new Human("Petr", 1000, 30),
                new Cat("Barsik", 2000, 34),
                new Robot("R2d2", 1470, 120),
                new Human("Ivan", 157, 1),
                new Cat("Kot", 200, 3)
        };

        for (Sportsman s : sportsmen) {
            System.out.println(s.toString());
        }

        Barrier[] barriers = {
                new Wall(10),
                new RunningTrack(1000),
                new RunningTrack(1400),
                new Wall(100)
        };

        for (Barrier b : barriers) {
            System.out.println(b.toString());
        }

        for (Barrier b : barriers) {
            System.out.println(b.toString());
            for (Sportsman s : sportsmen) {
                if (b instanceof RunningTrack)
                    s.run((RunningTrack) b);
                else
                    s.jump((Wall) b);
            }
        }


    }
}
