package FactoryPattern.ingredient.factories;

import FactoryPattern.PizzaIngredientFactory;
import FactoryPattern.ingredients.*;
import FactoryPattern.ingredients.impl.cheese.Mozarella;
import FactoryPattern.ingredients.impl.dough.ThickCrustDough;
import FactoryPattern.ingredients.impl.pepperoni.SlicedPepperoni;
import FactoryPattern.ingredients.impl.sauce.PlumTomatoSauce;
import FactoryPattern.ingredients.impl.veggies.BlackOlives;
import FactoryPattern.ingredients.impl.veggies.Spinach;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozarella();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new BlackOlives(), new Spinach()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
}
