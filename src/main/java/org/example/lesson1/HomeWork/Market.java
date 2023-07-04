package org.example.lesson1.HomeWork;

import java.util.HashMap;

public class Market {
    private String name;
    protected HashMap<Product, Integer> marketProds;

    public Market(String name, HashMap<Product, Integer> prods) {
        this.name = name;
        this.marketProds = prods;
    }

    public Market() {
        this.marketProds = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<Product, Integer> getMarketProds() {
        return marketProds;
    }

    public void setMarketProds(HashMap<Product, Integer> prods) {
        this.marketProds = prods;
    }

    @Override
    public String toString() {
        return "Market{" +
                "name='" + name + '\'' +
                ", prods=" + marketProds +
                '}';
    }
}
