package FactoryPattern.stores;

import FactoryPattern.ingredient.factories.ChicagoPizzaIngredientFactory;
import FactoryPattern.Pizza;
import FactoryPattern.PizzaIngredientFactory;
import FactoryPattern.PizzaStore;
import FactoryPattern.pizzas.CheesePizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new ChicagoPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (type.equals("veggie")) {
            // your implementation
        }
        return pizza;
    }
}
