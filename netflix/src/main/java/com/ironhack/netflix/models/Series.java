package com.ironhack.netflix.models;

import jakarta.persistence.*;

@Entity
public class Series extends Media {
    private Integer numberOfSeasons;
    private Integer numberOfEpisodes;

    public Series(String name, Integer yearReleased, Integer numberOfSeasons, Integer numberOfEpisodes) {
        super(name, yearReleased);
        this.numberOfSeasons = numberOfSeasons;
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public Series() {
    }

    public Integer getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setNumberOfSeasons(Integer numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }

    public Integer getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(Integer numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }
}
