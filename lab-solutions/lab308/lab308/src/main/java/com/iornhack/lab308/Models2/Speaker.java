package com.iornhack.lab308.Models2;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Speaker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double presentationDuration;

    @ManyToOne
    @JoinColumn(name = "conference_id")
    private Conference conference;


    public Speaker(String name, Double presentationDuration, Conference conference) {
        this.name = name;
        this.presentationDuration = presentationDuration;
        this.conference = conference;
    }

    public Speaker() {
    }

    public Conference getConference() {
        return conference;
    }

    public void setConference(Conference conference) {
        this.conference = conference;
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

    public Double getPresentationDuration() {
        return presentationDuration;
    }

    public void setPresentationDuration(Double presentationDuration) {
        this.presentationDuration = presentationDuration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speaker speaker = (Speaker) o;
        return Objects.equals(id, speaker.id) && Objects.equals(name, speaker.name) && Objects.equals(presentationDuration, speaker.presentationDuration) && Objects.equals(conference, speaker.conference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, presentationDuration, conference);
    }
}
