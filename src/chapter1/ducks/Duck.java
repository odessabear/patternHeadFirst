package chapter1.ducks;

import chapter1.ducks.interfaces.FlyBehavior;
import chapter1.ducks.interfaces.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){}

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

     public void swim(){
         System.out.println("All ducks float, even decoys!");
     }
}
