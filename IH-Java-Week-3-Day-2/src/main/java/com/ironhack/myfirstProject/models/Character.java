package com.ironhack.myfirstProject.models;

import javax.persistence.*;

@Entity
@Table(name = "characters")
// Se define la estrategia de herencia en el padre
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Character {

    @Id
    //Cuando hacemos table per class modificamos el GenerationType.IDENTITY por GenerationType.IDENTITY
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer hp;
    private boolean isAlive;


    public Character(String name, Integer hp, boolean isAlive) {
        this.name = name;
        this.hp = hp;
        this.isAlive = isAlive;
    }

    public Character() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
