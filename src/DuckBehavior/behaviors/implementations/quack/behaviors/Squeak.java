package DuckBehavior.behaviors.implementations.quack.behaviors;

import DuckBehavior.behaviors.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak, Squeak, Squeak");
    }
}
