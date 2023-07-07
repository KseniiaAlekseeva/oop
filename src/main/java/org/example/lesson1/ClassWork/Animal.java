package org.example.lesson1.ClassWork;

public abstract class Animal {
    protected String name;

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

    public abstract void animalInfo();
    public abstract void round();
    public void voice() {
        System.out.println("Animal with name " + name + " sounds loud.");
    }
    public void jump() {
        System.out.println("Animal with name " + name + " can jump.");
    }

}
