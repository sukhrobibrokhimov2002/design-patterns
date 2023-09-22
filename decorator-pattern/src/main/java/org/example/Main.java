package org.example;

public class Main {
    public static void main(String[] args) {
        Car bmw = new BmwCar();
        System.out.println("==BMW=");
        System.out.println("description: " + bmw.getDescription());
        System.out.println("price: " + bmw.getPrice());

        bmw = new LuxuryWheels(bmw);
        System.out.println("\n==BMW with luxury wheels=");
        System.out.println("description: " + bmw.getDescription());
        System.out.println("price: " + bmw.getPrice());

        bmw = new BoostedEngine(bmw);
        System.out.println("\n==BMW with luxury wheels with boosted engine=");
        System.out.println("description: " + bmw.getDescription());
        System.out.println("price: " + bmw.getPrice());

    }
}
