package org.example.lesson1.HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Ex1 {
    public static void main(String[] args) {
        Product pr0 = new Product("bag S", 40, 4.2);
        Product pr00 = new Product("bag M", 50, 4.1);
        Product pr1 = new Product("orange", 1000, 4.5);
        Product pr2 = new Product("apple", 100, 4.2);
        Product pr3 = new Product("pineapple", 1300, 4.8);
        Product pr4 = new Product("cucumber", 300, 4.3);
        Product pr5 = new Product("tomato", 400, 4.2);

        Category other = new Category("other", new ArrayList<Product>(Arrays.asList(pr0, pr00)));
        System.out.println("other.toString() = " + other.toString());
        Category fruits = new Category("fruits", new ArrayList<Product>(Arrays.asList(pr1, pr2, pr3)));
        System.out.println("fruits.toString() = " + fruits.toString());
        Category vegetables = new Category("vegetables", new ArrayList<Product>(Arrays.asList(pr4, pr5)));
        System.out.println("vegetables.toString() = " + vegetables.toString());

        Market market1 = new Market();
        market1.setName("Oops!");
        HashMap marketProds = new HashMap();
        marketProds.put(pr0, 10);
        marketProds.put(pr00, 7);
        marketProds.put(pr1, 1);
        marketProds.put(pr2, 4);
        marketProds.put(pr3, 2);
        marketProds.put(pr4, 2);
        market1.setMarketProds(marketProds);
        System.out.println("market1.toString() = " + market1.toString());

        Basket basket1 = new Basket();
        basket1.setName(market1.getName());
        basket1.setMarketProds(market1.getMarketProds());
        User user1 = new User("user1", "123", basket1);
        buyProd(market1, basket1, pr5);
        buyProd(market1, basket1, pr3);
        buyProd(market1, basket1, pr3);
        buyProd(market1, basket1, pr3);
        buyProd(market1, basket1, pr0);
        returnProd(market1, basket1, pr3);
        returnProd(market1, basket1, pr1);
        returnProd(market1, basket1, pr0);
        System.out.println("user1.toString() = " + user1.toString());

        Basket basket2 = new Basket();
        basket2.setName(market1.getName());
        basket2.setMarketProds(market1.getMarketProds());
        User user2 = new User("user2", "234", basket2);
        buyProd(market1, basket2, pr3);
        System.out.println("user2.toString() = " + user2.toString());
    }

    private static void buyProd(Market market, Basket basket, Product product) {
        System.out.println("Buy: ");
        basket.addProd(product);
        System.out.println(basket.toString());
        System.out.println(market.toString());
    }

    private static void returnProd(Market market, Basket basket, Product product) {
        System.out.println("Return: ");
        basket.deleteProd(product);
        System.out.println(basket.toString());
        System.out.println(market.toString());
    }
}
