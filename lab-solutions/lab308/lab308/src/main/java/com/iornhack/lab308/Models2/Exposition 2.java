package com.iornhack.lab308.Models2;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Exposition extends Event {

    public Exposition() {
    }

    public Exposition(LocalDate date, Double duration, String location, String title) {
        super(date, duration, location, title);
    }

}
