package StrategyPattern;

import StrategyPattern.behaviors.impl.BowAndArrowBehavior;

public class Queen extends Character{
    public Queen() {
        weapon = new BowAndArrowBehavior();
    }
}
