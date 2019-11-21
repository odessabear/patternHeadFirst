package chapter1.ducks.testTask;

public class Troll extends Character {

    public Troll(){
        weapon = new AxeBehavior();
    }
    @Override
    public void fight() {
        System.out.println("I'm an angry troll?and I'll kill you!");
    }
}
