package StrategyPattern;

import StrategyPattern.behaviors.impl.AxeBehavior;

public class Troll extends Character{
    public Troll() {
        weapon = new AxeBehavior();
    }
}
