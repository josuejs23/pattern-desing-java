package org.josue.factory;

import org.josue.factory.product.PizzaNewYorkMeat;
import org.josue.factory.product.PizzaNewYorkNapolitana;
import org.josue.factory.product.PizzaNewYorkVegetal;

public class PizzaShopNewYorkFactory extends PizzaShopZoneAbstractFactory {

    @Override
    PizzaProduct createPizza(String type) {
        return switch (type) {
            case "meat" -> new PizzaNewYorkMeat();
            case "vegetarian" -> new PizzaNewYorkVegetal();
            case "napolitana" -> new PizzaNewYorkNapolitana();
            default -> null;
        };
    }
}
