package org.example.simpleFactory;

public abstract class Pizza {
    void prepare() {
        System.out.println("preparing");
    }

    ;

    void bake() {
        System.out.println("baking");
    }

    ;

    void cut() {
        System.out.println("cutting");

    }

    ;

    void box() {
        System.out.println("boxing");
    }

    ;
}
