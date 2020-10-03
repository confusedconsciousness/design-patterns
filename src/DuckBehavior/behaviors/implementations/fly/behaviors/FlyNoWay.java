package DuckBehavior.behaviors.implementations.fly.behaviors;

import DuckBehavior.behaviors.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I guess I can't fly, why God? why?");
    }
}
