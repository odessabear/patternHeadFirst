package chapter1.strategy.ducks.implementClasses;

import chapter1.strategy.ducks.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
