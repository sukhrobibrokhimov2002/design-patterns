package org.example.abstractFactory;

public abstract class Pizza {
    String name;
    Dough dough;
    Clams clams;
    Sauce sauce;
    Cheese cheese;

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 30minutes");
    }

    void cut() {
        System.out.println("Cutting in diagonal slices");
    }

    void box() {
        System.out.println("Boxing in special box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
