package org.example.classes;

public class Warrior extends Player{

    private int stamina;

    public Warrior(int strength, int lives, int stamina) {
        super(strength, lives);
        this.stamina = stamina;
    }


    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void recoverStamina(){
        this.stamina++;
    }
}
