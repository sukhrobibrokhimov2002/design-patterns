package org.example;

public class BmwCar implements Car {

    @Override
    public String getDescription() {
        return "The fastest car in europe";
    }

    @Override
    public double getPrice() {
        return 95000;
    }
}
