package StrategyPattern.behaviors.impl;

import StrategyPattern.behaviors.WeaponBehavior;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("I'll kill you with my Knife!");
    }
}
