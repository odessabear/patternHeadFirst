package chapter1.ducks;

import chapter1.ducks.implementClasses.FlyNoWay;
import chapter1.ducks.implementClasses.FlyRocketPowered;
import chapter1.ducks.implementClasses.Quack;
import chapter1.ducks.implementClasses.Squeak;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        System.out.println();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        System.out.println();

        OwnModelDuck ownModelDuck = new OwnModelDuck();
        ownModelDuck.quackBehavior.quack();
        ownModelDuck.flyBehavior.fly();
        ownModelDuck.setFlyBehavior(new FlyRocketPowered());
        ownModelDuck.flyBehavior.fly();
    }
}
