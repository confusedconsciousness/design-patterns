package FactoryPattern;

import FactoryPattern.stores.ChicagoPizzaStore;
import FactoryPattern.stores.NYPizzaStore;

public class Dominos {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("I ordered a " + pizza.getName() + "\n");

        pizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("My friend ordered a " + pizza.getName());
    }
}
