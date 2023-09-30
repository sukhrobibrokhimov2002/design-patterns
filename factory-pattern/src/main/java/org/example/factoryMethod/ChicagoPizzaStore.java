package org.example.factoryMethod;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else {
            return new ChicagoStylePepperoniPizza();
        }
    }
}
