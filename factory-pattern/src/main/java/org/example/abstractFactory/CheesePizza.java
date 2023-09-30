package org.example.abstractFactory;

public class CheesePizza extends Pizza{
    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing: "+name);
        dough= pizzaIngredientFactory.createDough();
        cheese= pizzaIngredientFactory.createCheese();
        sauce= pizzaIngredientFactory.createSauce();
        clams= pizzaIngredientFactory.createClam();
    }
}
