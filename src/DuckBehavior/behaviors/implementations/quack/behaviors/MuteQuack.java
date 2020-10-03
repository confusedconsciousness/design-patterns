package DuckBehavior.behaviors.implementations.quack.behaviors;

import DuckBehavior.behaviors.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("..... <<Silence>> .....");
    }
}
