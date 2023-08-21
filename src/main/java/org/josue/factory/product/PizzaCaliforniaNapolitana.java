package org.josue.factory.product;

import org.josue.factory.PizzaProduct;

public class PizzaCaliforniaNapolitana extends PizzaProduct {

    public PizzaCaliforniaNapolitana() {
        super();
        name = "Pizza California Napolitana";
        sauce = "California Sauce";
        dough = "Double Dough";
        ingredients.add("Cheese California");
    }

    @Override
    public void cook() {
        System.out.println("Cooking California Napolitana");
    }

    @Override
    public void cut() {
        System.out.println("Cutting California Napolitana");
    }
}
