package org.example;


import org.example.factoryMethod.ChicagoPizzaStore;
import org.example.factoryMethod.NyPizzaStore;
import org.example.factoryMethod.PizzaStore;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n--------NY cheese");
        PizzaStore nyPizzaStore = new NyPizzaStore();
        nyPizzaStore.orderPizza("cheese");
        System.out.println("\n --------Ny pepperoni");
        nyPizzaStore.orderPizza("pepperoni");

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        System.out.println("\n--------Chicago cheese");
        chicagoPizzaStore.orderPizza("cheese");
        System.out.println("\n---------Chicago pepperoni");
        chicagoPizzaStore.orderPizza("pepperoni");


    }
}
