package DuckBehavior.behaviors.implementations.fly.behaviors;

import DuckBehavior.behaviors.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Look Mama, I am flying");
    }
}
