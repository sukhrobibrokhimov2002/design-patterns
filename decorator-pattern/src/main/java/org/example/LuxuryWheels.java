package org.example;

public class LuxuryWheels extends CarDecorator {

    public LuxuryWheels(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with luxury wheels";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 15000;
    }
}
