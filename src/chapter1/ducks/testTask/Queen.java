package chapter1.ducks.testTask;

public class Queen extends Character{

    public Queen(){
        weapon = new BowAndArrowBehavior();
    }
    @Override
    public void fight() {
        System.out.println("I'm a Queen");
    }
}
