package chapter1.ducks.testTask;

public class Knight extends Character {

    public Knight(){
        weapon = new SwordBehavior();
    }
    @Override
    public void fight() {
        System.out.println("I'm a brave knight!");
    }
}
