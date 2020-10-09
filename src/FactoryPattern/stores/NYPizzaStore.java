package FactoryPattern.stores;

import FactoryPattern.ingredient.factories.NYPizzaIngredientFactory;
import FactoryPattern.Pizza;
import FactoryPattern.PizzaIngredientFactory;
import FactoryPattern.PizzaStore;
import FactoryPattern.pizzas.CheesePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals("veggie")) {
            // can create your own implementation
        }
        return pizza;
    }
}
