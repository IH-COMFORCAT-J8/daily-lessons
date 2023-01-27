package com.example.lab306.models2;

import javax.persistence.*;

@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Name name;

    @Enumerated(EnumType.STRING)
    private Title title;



    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
