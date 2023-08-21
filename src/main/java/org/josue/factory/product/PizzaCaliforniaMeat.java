package org.josue.factory.product;

import org.josue.factory.PizzaProduct;

public class PizzaCaliforniaMeat extends PizzaProduct {

    public PizzaCaliforniaMeat() {
        super();
        name = "Pizza California Meat";
        sauce = "Sauce California";
        dough = "Simple dough";
        ingredients.add("Pork");
        ingredients.add("Ham");
        ingredients.add("Chicken");
    }

    @Override
    public void cook() {
        System.out.println("Cooking pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting pizza");
    }
}
