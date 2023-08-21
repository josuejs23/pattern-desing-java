package org.josue.factory;

abstract public class PizzaShopZoneAbstractFactory {
    public PizzaProduct orderPizza(String type){
        PizzaProduct pizzaProduct = createPizza(type);
        System.out.println("\t\t=========== Building Pizza ===========");
        pizzaProduct.prepare();
        pizzaProduct.cook();
        pizzaProduct.cut();
        pizzaProduct.packagingPizza();
        return pizzaProduct;
    }

    abstract PizzaProduct createPizza(String type);
}
