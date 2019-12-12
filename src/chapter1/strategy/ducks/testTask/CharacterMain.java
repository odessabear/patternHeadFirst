package chapter1.strategy.ducks.testTask;

public class CharacterMain {
    public static void main(String[] args) {
        Character character1 = new Queen();
        character1.fight();
        character1.weaponChoice();
        character1.setWeapon(new KnifeBehavior());
        System.out.println("But sometimes ");
        character1.weaponChoice();

        System.out.println("-------------------------------------");

        Character character2 = new Troll();
        character2.setWeapon(new AxeBehavior());
        character2.fight();
        character2.weaponChoice();
        System.out.println();
        character2.setWeapon(new SwordBehavior());
        character2.weaponChoice();

    }
}
