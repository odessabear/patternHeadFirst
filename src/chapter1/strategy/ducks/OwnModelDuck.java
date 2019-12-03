package chapter1.strategy.ducks;

import chapter1.strategy.ducks.implementClasses.FlyNoWay;
import chapter1.strategy.ducks.implementClasses.Squeak;
import chapter1.strategy.ducks.interfaces.FlyBehavior;
import chapter1.strategy.ducks.interfaces.QuackBehavior;

public class OwnModelDuck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public OwnModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
