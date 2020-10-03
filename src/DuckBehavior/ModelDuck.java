package DuckBehavior;

import DuckBehavior.behaviors.implementations.fly.behaviors.FlyNoWay;
import DuckBehavior.behaviors.implementations.quack.behaviors.Quack;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I am a model duck");
    }
}
