package org.example.lesson1.ClassWork;

public class Cat extends Animal {
    private String color;
    private Integer age;

    public Cat() {
    }

    @Override
    public void animalInfo() {
        System.out.println("Cat " + super.getName() + " with color " + color + " age of " + age);
    }

    public Cat(String name, String color, Integer age) {
        super(name);
        this.color = color;
        if (age >= 0)
            this.age = age;
        else
            System.out.println("Incorrect age.");

    }

    public String getColor() {
        return color;
    }

    public Integer getAge() {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(Integer age) {
        if (age >= 0)
            this.age = age;
        else
            System.out.println("Incorrect age.");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
