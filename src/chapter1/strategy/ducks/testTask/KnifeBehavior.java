package chapter1.strategy.ducks.testTask;

public class KnifeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("I'm using a Knife");
    }
}
