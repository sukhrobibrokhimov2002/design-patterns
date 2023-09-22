package org.example;

public class Mute implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("i am muted");
    }
}
