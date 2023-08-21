package org.josue.factory;

import org.josue.factory.product.PizzaNewYorkNapolitana;

public class Main {
    public static void main(String[] args) {
        PizzaShopZoneAbstractFactory nyFactory = new PizzaShopNewYorkFactory();
        PizzaProduct nyNapolitana = nyFactory.orderPizza("napolitana");
        System.out.println("======================");
        PizzaShopZoneAbstractFactory caliFactory = new PizzaShopCaliforniaFactory();
        PizzaProduct caliNapolitana = caliFactory.orderPizza("napolitana");
    }
}
