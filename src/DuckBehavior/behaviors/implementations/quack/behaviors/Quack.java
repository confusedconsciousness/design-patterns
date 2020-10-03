package DuckBehavior.behaviors.implementations.quack.behaviors;

import DuckBehavior.behaviors.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Look mama! Quack, Quack, Quack");
    }
}
