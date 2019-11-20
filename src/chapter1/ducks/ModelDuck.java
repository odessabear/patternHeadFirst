package chapter1.ducks;

import chapter1.ducks.Duck;
import chapter1.ducks.implementClasses.FlyNoWay;
import chapter1.ducks.implementClasses.Quack;

public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
