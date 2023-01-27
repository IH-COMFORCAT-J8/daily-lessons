package org.example.classes;

public abstract class Player {
    private int health;
    private int strength;
    private int lives;

    private static final int maxHealth = 100;

    public Player(int strength, int lives) {
        this.health = maxHealth;
        this.strength = strength;
        this.lives = lives;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void decrementLive(){
        if(getLives() > 0 ){
            setLives(getLives() - 1);
            setHealth(maxHealth);
        }
    }

    public void attack(Player enemy){
        enemy.setHealth(enemy.getHealth() - getStrength());
        if(enemy.getHealth() <= 0) enemy.decrementLive();
    }

    @Override
    public String toString() {
        return "Player{" +
                "health=" + health +
                ", strength=" + strength +
                ", lives=" + lives +
                '}';
    }
}
