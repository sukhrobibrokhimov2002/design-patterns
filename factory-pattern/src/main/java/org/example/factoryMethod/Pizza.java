package org.example.factoryMethod;

public class Pizza {
    String name;
    String dough;
    String sauce;

    void prepare() {
        System.out.println("Preparing: " + name);
        System.out.println("Tossing dough: " + dough);
        System.out.println("Adding sauce: " + sauce);
    }

    void bake() {
        System.out.println("Baking: " + name);
    }

    void cut() {
        System.out.println("Cutting pizza into diagonal : " + name);
    }

    void box() {
        System.out.println("Placed pizza into box : " + name);
    }

}
