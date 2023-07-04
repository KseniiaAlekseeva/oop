package org.example.lesson1.HomeWork;

public class Product {
    private String name;
    private Integer price;
    private Double rate;

    public Product(String name, Integer price, Double rate) {
        this.name = name;
        this.price = price;
        this.rate = rate;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rate=" + rate +
                '}';
    }
}
