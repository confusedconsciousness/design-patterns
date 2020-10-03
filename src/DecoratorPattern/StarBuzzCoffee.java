package DecoratorPattern;

import DecoratorPattern.beverages.Decaf;
import DecoratorPattern.beverages.Espresso;
import DecoratorPattern.condiments.Mocha;
import DecoratorPattern.condiments.Soy;
import DecoratorPattern.condiments.Whip;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + ", $" + espresso.cost());

        Beverage decaf = new Decaf();
        decaf = new Mocha(decaf);
        decaf = new Soy(decaf);
        decaf = new Whip(decaf);
        System.out.println(decaf.getDescription() + ", $" + decaf.cost());
    }
}
