package com.iornhack.lab308.Models2;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Conference extends Event {

    @OneToMany(mappedBy = "conference", fetch = FetchType.EAGER)
    private List<Speaker> speakerList;

    public Conference(LocalDate date, Double duration, String location, String title) {
        super(date, duration, location, title);
        this.speakerList = new ArrayList<>();
    }

    public Conference() {
    }

    public List<Speaker> getSpeakerList() {
        return speakerList;
    }

    public void setSpeakerList(List<Speaker> speakerList) {
        this.speakerList = speakerList;
    }
}
