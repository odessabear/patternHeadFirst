package chapter1.ducks.testTask;

public abstract class Character {
    WeaponBehavior weapon;

    public abstract void fight();

    public void weaponChoice(){
      weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior weapon){
        this.weapon = weapon;
    }
}
