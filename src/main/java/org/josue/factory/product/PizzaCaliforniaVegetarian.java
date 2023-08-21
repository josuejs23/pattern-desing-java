package org.josue.factory.product;

import org.josue.factory.PizzaProduct;

public class PizzaCaliforniaVegetarian extends PizzaProduct {
    public PizzaCaliforniaVegetarian() {
        super();
        name = "Pizza California Vegetarian";
        sauce = "Vegetarian Sauce";
        dough = "Double dough";
        ingredients.add("Champinion");
        ingredients.add("Corn");
    }

    @Override
    public void cook() {
        System.out.println("Cooking Pizza California Vegetarian");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Pizza California Vegetarian");
    }
}
