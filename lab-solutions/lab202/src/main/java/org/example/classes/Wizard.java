package org.example.classes;

public class Wizard extends Player{

    private int mana;

    public Wizard(int strength, int lives, int mana) {
        super(strength, lives);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void recoverMana(){
        this.mana++;
    }

}
