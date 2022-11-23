package com.ironhack.myfirstProject.models;

import javax.persistence.*;

@Entity
public class Wizard extends Character {

    private int mana;
    private int intelligence;

    public Wizard() {
    }

    public Wizard(String name, int hp, boolean isAlive, int mana, int intelligence) {
        super( name, hp, isAlive);
        this.mana = mana;
        this.intelligence = intelligence;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "mana=" + mana +
                ", intelligence=" + intelligence +
                '}';
    }

}




