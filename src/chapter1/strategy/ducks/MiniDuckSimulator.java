package chapter1.strategy.ducks;

import chapter1.strategy.ducks.implementClasses.FlyRocketPowered;
import chapter1.strategy.ducks.implementClasses.FlyWithWings;

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
        ownModelDuck.setFlyBehavior(new FlyWithWings());
        ownModelDuck.flyBehavior.fly();
    }
}
