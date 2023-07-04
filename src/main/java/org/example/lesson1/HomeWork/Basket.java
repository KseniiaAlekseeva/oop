package org.example.lesson1.HomeWork;

import java.util.HashMap;

public class Basket extends Market {
    private HashMap<Product, Integer> prods;

    public Basket(String name, HashMap<Product, Integer> marketProds, HashMap<Product, Integer> prods) {
        super(name, marketProds);
        this.prods = prods;
    }

    public Basket() {
        this.prods = new HashMap<>();
    }

    public HashMap<Product, Integer> getProds() {
        return prods;
    }

    public void setProds(HashMap<Product, Integer> prods) {
        this.prods = prods;
    }

    public void addProd(Product prod) {
        if (super.getMarketProds().containsKey(prod)) {
            this.prods.putIfAbsent(prod, 0);
            this.prods.put(prod, this.prods.get(prod) + 1);
            if (super.marketProds.get(prod) > 1)
                super.marketProds.put(prod, this.marketProds.get(prod) - 1);
            else
                super.marketProds.remove(prod);
        } else
            System.out.println("There is no product " + prod.getName() + " in market.");
    }

    public void deleteProd(Product prod) {
        if (this.prods.containsKey(prod)) {
            if (this.prods.get(prod) > 1)
                this.prods.put(prod, this.prods.get(prod) - 1);
            else
                this.prods.remove(prod);
            super.marketProds.putIfAbsent(prod, 0);
            super.marketProds.put(prod, this.marketProds.get(prod) + 1);
        }
    }

    @Override
    public String toString() {
        return "Basket{" +
                "prods=" + prods +
                '}';
    }

}
