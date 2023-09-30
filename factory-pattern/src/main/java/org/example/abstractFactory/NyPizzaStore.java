package org.example.abstractFactory;

public class NyPizzaStore extends PizzaStore {


    @Override
    Pizza createPizza(String item) {
        PizzaIngredientFactory ingredientFactory = new NyPizzaIngredientFactory();
        if (item.equals("cheese")){
            CheesePizza cheesePizza = new CheesePizza(ingredientFactory);
            cheesePizza.setName("Ny style cheese pizza");
            return cheesePizza;
        }else {
            PepperoniPizza pepperoniPizza = new PepperoniPizza(ingredientFactory);
            pepperoniPizza.setName("Ny style pepperoni pizza");
            return pepperoniPizza;
        }
    }
}
