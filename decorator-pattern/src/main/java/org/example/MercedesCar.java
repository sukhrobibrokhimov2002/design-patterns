
package org.example;

public class MercedesCar implements Car {

    @Override
    public String getDescription() {
        return "The most luxury car in europe";
    }

    @Override
    public double getPrice() {
        return 105000;
    }
}
