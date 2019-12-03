package chapter1.strategy.ducks.implementClasses;

import chapter1.strategy.ducks.interfaces.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
