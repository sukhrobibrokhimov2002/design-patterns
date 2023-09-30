package org.example.abstractFactory;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String item) {
        PizzaIngredientFactory ingredientFactory =
                new ChicagoIngredientFactory();
        if (item.equals("cheese")) {
            CheesePizza cheesePizza = new CheesePizza(ingredientFactory);
            cheesePizza.setName("Chicago cheese pizza");
            return cheesePizza;
        } else {
            PepperoniPizza pepperoniPizza = new PepperoniPizza(ingredientFactory);
            pepperoniPizza.setName("Chicago pepperoni pizza");
            return pepperoniPizza;
        }
    }
}
