package StrategyPattern;

import StrategyPattern.behaviors.impl.KnifeBehavior;

public class GameSimulator {
    public static void main(String[] args) {
        Character king = new King();
        king.fight();

        king.setWeapon(new KnifeBehavior());
        king.fight();
    }
}
