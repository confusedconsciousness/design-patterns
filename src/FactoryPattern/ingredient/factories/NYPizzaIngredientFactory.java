package FactoryPattern.ingredient.factories;


import FactoryPattern.PizzaIngredientFactory;
import FactoryPattern.ingredients.*;
import FactoryPattern.ingredients.impl.dough.ThinCrustDough;
import FactoryPattern.ingredients.impl.pepperoni.SlicedPepperoni;
import FactoryPattern.ingredients.impl.sauce.MarinaraSauce;
import FactoryPattern.ingredients.impl.veggies.Garlic;
import FactoryPattern.ingredients.impl.veggies.Mushroom;
import FactoryPattern.ingredients.impl.veggies.Onion;
import FactoryPattern.ingredients.impl.cheese.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
}
