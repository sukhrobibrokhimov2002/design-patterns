package org.example.factoryMethod;

public class NyPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NyStyleCheesePizza();
        } else {
            return new NyStylePepperoniPizza();
        }
    }
}
