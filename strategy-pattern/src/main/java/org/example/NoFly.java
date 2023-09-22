package org.example;

public class NoFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can not fly");
    }
}
