package FactoryPattern;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
    // createPizza acts as a factory method
    // a factory method is abstract, so the subclasses are counted on to handle object creation
    // a factory method returns a Product (pizza) that is typically used within methods defined
    // in the superclass
    // it isolates the client (the code in the superclass, like orderPizza()) from knowing what kind of concrete
    // product is actually created
    protected abstract Pizza createPizza(String type);
}
