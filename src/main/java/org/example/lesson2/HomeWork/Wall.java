package org.example.lesson2.HomeWork;

public class Wall extends Barrier {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Wall {" +
                "id=" + id +
                ", height=" + height +
                '}';
    }


}
