package org.example.lesson1.ClassWork;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println("Animal with name " + name);
    }
    public void voice() {
        System.out.println("Animal with name " + name + " sounds loud.");
    }
    public void jump() {
        System.out.println("Animal with name " + name + " can jump.");
    }

}
