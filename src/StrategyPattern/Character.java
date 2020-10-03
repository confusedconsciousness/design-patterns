package StrategyPattern;

import StrategyPattern.behaviors.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weapon;

    public Character() {}

    public void fight(){
        weapon.useWeapon();
    }

    // setters
    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
