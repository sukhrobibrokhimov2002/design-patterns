package org.example.simpleFactory;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CheesePizza();
        } else {
            return new VeggiePizza();
        }
    }
}
