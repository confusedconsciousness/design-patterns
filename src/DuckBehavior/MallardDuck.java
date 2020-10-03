package DuckBehavior;

import DuckBehavior.behaviors.implementations.fly.behaviors.FlyWithWings;
import DuckBehavior.behaviors.implementations.quack.behaviors.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a really cool Mallard Duck");
    }
}
