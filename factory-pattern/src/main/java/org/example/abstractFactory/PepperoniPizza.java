package org.example.abstractFactory;

public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.ingredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing: " + name);
        sauce = ingredientFactory.createSauce();
        dough = ingredientFactory.createDough();
        cheese = ingredientFactory.createCheese();
    }
}
