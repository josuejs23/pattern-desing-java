package org.josue.factory.product;

import org.josue.factory.PizzaProduct;

public class PizzaNewYorkNapolitana extends PizzaProduct {

    public PizzaNewYorkNapolitana() {
        super();
        this.name = "Pizza New York Napolitana";
        this.dough = "Double Dough";
        this.sauce = "Naptolian Sauce";
        this.ingredients.add("Corn Napolitan");
        this.ingredients.add("Cheese Napolitan");
        this.ingredients.add("Ham Napolitan");
    }

    @Override
    public void cook() {
        System.out.println("Cookinng Napolitan pizza at 60c");
    }

    @Override
    public void cut() {
        System.out.println("Cutting pizza in napolitan form");
    }
}
