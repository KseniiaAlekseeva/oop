package org.example.lesson1.HomeWork;

import java.util.ArrayList;

public class Category {
    private String name;
    private ArrayList<Product> prods;

    public Category(String name, ArrayList<Product> prods) {
        this.name = name;
        this.prods = prods;
    }

    public Category() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProds() {
        return prods;
    }

    public void setProds(ArrayList<Product> prods) {
        this.prods = prods;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", prods=" + prods +
                '}';
    }
}
