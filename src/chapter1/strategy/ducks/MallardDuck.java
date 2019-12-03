package chapter1.strategy.ducks;

import chapter1.strategy.ducks.implementClasses.FlyWithWings;
import chapter1.strategy.ducks.implementClasses.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck!");
    }
}
