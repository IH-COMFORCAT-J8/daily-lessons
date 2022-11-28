package com.iornhack.lab308.Models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Association {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @OneToMany(mappedBy = "association", cascade = CascadeType.ALL)
    private List<Chapter> chapterList;

    public Association() {
        this.chapterList = new ArrayList<>();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Chapter> getChapterList() {
        return chapterList;
    }

    public void setChapterList(List<Chapter> chapterList) {
        this.chapterList = chapterList;
    }
}
