package FactoryPattern;

import FactoryPattern.ingredients.*;

import java.util.ArrayList;

public abstract class Pizza {
    public String name;
    public Dough dough;
    public Sauce sauce;
    public Veggies veggies[];
    public Cheese cheese;
    public Pepperoni pepperoni;

    public abstract void prepare(); // this will help in assigning the region wise ingredients

    void bake() {
        System.out.println("Bake for 30 min at 350 F");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Placing pizza in official Dominos box");
    }

    public void  setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String toString() {
        return "pizza";
    }

}
