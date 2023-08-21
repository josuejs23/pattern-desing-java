package org.josue.factory;

import java.util.ArrayList;
import java.util.List;

abstract public class PizzaProduct {
    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> ingredients;

    public PizzaProduct() {
        this.ingredients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void prepare(){
        System.out.printf("Making : %s%n", name);
        System.out.printf("Choosing the mass : %s%n", dough);
        System.out.printf("Adding sauce : %s%n", sauce);
        System.out.println("Adding ingredients");
        ingredients.forEach(System.out::println);
    }

    abstract public void cook();
    abstract public void cut();

    public void packagingPizza() {
        System.out.println("Puttin the pizza at the package ");
    }

    @Override
    public String toString() {
        return "PizzaProduct{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
