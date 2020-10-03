package StrategyPattern;

import StrategyPattern.behaviors.impl.SwordBehavior;

public class King extends Character{
    public King() {
        // default
        weapon = new SwordBehavior();
    }
}
