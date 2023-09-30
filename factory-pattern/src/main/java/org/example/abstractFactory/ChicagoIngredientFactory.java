package org.example.abstractFactory;

public class ChicagoIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozarellaCheese();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
