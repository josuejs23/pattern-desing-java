package org.josue.factory.product;

import org.josue.factory.PizzaProduct;

import java.util.List;

public class PizzaNewYorkVegetal extends PizzaProduct {

    public PizzaNewYorkVegetal() {
        super();
        this.name = "Pizza New York Vegetal";
        this.dough = "Dough double";
        this.sauce = "Extra sauce";
        this.ingredients.add("Peperoni");
        this.ingredients.add("Italian sauge");
        this.ingredients.add("Corn");
    }

    @Override
    public void cook() {
        System.out.printf("Cooking the pizza %s", this.name);
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza");
    }
}
