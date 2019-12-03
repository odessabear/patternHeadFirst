package chapter1.strategy.ducks.testTask;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("You'll be defeated by my Sword!");
    }
}
