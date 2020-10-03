package StrategyPattern;

import StrategyPattern.behaviors.impl.SwordBehavior;

public class Knight extends Character{
    public Knight() {
        weapon = new SwordBehavior();
    }
}
