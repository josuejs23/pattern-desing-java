package org.josue.factory;

import org.josue.factory.product.PizzaCaliforniaMeat;
import org.josue.factory.product.PizzaCaliforniaNapolitana;
import org.josue.factory.product.PizzaCaliforniaVegetarian;

public class PizzaShopCaliforniaFactory extends  PizzaShopZoneAbstractFactory{
    @Override
    PizzaProduct createPizza(String type) {
        return switch (type){
            case "meat" -> new PizzaCaliforniaMeat();
            case "napolitana" -> new PizzaCaliforniaNapolitana();
            case "vegetarian" -> new PizzaCaliforniaVegetarian();
            default -> null;
        };
    }
}
