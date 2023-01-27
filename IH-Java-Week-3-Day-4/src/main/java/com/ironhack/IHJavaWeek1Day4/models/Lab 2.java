package com.ironhack.IHJavaWeek1Day4.models;

import javax.persistence.*;

@Entity
public class Lab {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer score;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    public Lab(String name, Integer score, Student student) {
        this.name = name;
        this.score = score;
        this.student = student;
    }

    public Lab() {
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

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
