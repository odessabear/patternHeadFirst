package chapter1.strategy.ducks.testTask;

public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("My favorite weapon a Bow with arrows!");
    }
}
