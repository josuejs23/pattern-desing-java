package org.josue.factory.product;

import org.josue.factory.PizzaProduct;

public class PizzaNewYorkMeat extends PizzaProduct {
    public PizzaNewYorkMeat() {
        super();
        name = "Pizza New York Meat";
        sauce = "Sauce Meat";
        dough = "Simple dough";
        ingredients.add("Pork");
        ingredients.add("Ham");
        ingredients.add("Salame");
    }

    @Override
    public void cook() {
        System.out.println("Cooking Meat New York Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting pizza by half");
    }
}
