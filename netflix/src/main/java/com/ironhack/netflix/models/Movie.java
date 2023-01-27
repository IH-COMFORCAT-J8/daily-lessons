package com.ironhack.netflix.models;

import jakarta.persistence.*;

@Entity
public class Movie extends Media {
    private Integer duration;

    public Movie(String name, Integer yearReleased, Integer duration) {
        super(name, yearReleased);
        this.duration = duration;
    }

    public Movie() {
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}
