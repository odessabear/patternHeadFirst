package chapter1.ducks;

import chapter1.ducks.implementClasses.FlyNoWay;
import chapter1.ducks.implementClasses.Quack;
import chapter1.ducks.implementClasses.Squeak;
import chapter1.ducks.interfaces.FlyBehavior;
import chapter1.ducks.interfaces.QuackBehavior;

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
