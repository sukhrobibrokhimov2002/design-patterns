package org.example;

public class BoostedEngine extends CarDecorator {

    public BoostedEngine(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " With v12 engine";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 45000;
    }
}
