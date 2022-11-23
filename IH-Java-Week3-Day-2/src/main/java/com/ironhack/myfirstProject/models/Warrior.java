package com.ironhack.myfirstProject.models;

import javax.persistence.*;

@Entity
public class Warrior extends Character {
    private int stamina;
    private int strength;

    public Warrior(String name, int hp, boolean isAlive, int stamina, int strength) {
        super( name, hp, isAlive);
        this.stamina = stamina;
        this.strength = strength;
    }

    public Warrior() {
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return super.toString() +
                "stamina=" + stamina +
                ", strength=" + strength +
                '}';
    }



}

