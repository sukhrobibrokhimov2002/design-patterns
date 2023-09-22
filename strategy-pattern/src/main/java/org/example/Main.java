package org.example;

public class Main {
    public static void main(String[] args) {
        Duck walmartDuck = new WalmartDuck();
        walmartDuck.setFlyBehaviour(new FlyWithWings());
        walmartDuck.setQuackBehaviour(new Squeack());
        walmartDuck.display();
        walmartDuck.getQuackBehaviour().quack();
        walmartDuck.getFlyBehaviour().fly();

        Duck mallardDuck = new MallardDuck();
        mallardDuck.setQuackBehaviour(new Mute());
        mallardDuck.setFlyBehaviour(new FlyWithJet());
        mallardDuck.display();
        mallardDuck.getFlyBehaviour().fly();
        mallardDuck.getQuackBehaviour().quack();
    }
}
