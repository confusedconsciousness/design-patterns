package DuckBehavior;

import DuckBehavior.behaviors.implementations.fly.behaviors.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        // ability to change the behavior on the run
        Duck model = new ModelDuck();
        model.performFly();;
        model.performQuack();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
