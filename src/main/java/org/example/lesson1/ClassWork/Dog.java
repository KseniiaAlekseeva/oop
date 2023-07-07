package org.example.lesson1.ClassWork;

public class Dog extends Animal {
    private String color;
    private Integer age;

    public Dog(String name, String color, Integer age) {
        super(name);
        this.color = color;
        this.age = age;
    }

    public Dog() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public void round() {
        System.out.println("Dog with name " + name + " age of " + age + " and color " + color + " is round.");
    }

    @Override
    public void animalInfo() {
        System.out.println("Dog ");
    }

    @Override
    public void voice() {
        System.out.println("Gav");
    }
}
