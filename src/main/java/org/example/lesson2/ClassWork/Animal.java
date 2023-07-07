package org.example.lesson2.ClassWork;

public class Animal {
    protected String name;
    protected String type;
    protected int maxRunDist;
    protected int maxSwimDist;
    public static int count = 0;

    public Animal() {
    }

    public Animal(String name, String type, int maxRunDist, int maxSwimDist) {
        this.name = name;
        this.type = type;
        if (this.type.equals("Cat")) {
            if (maxRunDist > 200)
                this.maxRunDist = 200;
            this.maxSwimDist = maxSwimDist;
        } else {
            if (maxRunDist > 500)
                this.maxRunDist = 500;
            if (maxSwimDist > 10)
                this.maxSwimDist = 10;
        }
        count++;
    }

    protected void run(int dist) {
        if (dist <= maxRunDist)
            System.out.println(type + " - " + this.name + " ran distance " + dist);
        else
            System.out.println(type + " - " + this.name + " CAN'T run distance " + dist);
    }

    protected void swim(int dist) {
        if (dist <= maxSwimDist)
            System.out.println(type + " - " + this.name + " swam distance " + dist);
        else
            System.out.println(type + " - " + this.name + " CAN'T swim distance " + dist);
    }

}
