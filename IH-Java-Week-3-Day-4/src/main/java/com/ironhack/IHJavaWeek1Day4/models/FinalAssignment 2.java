package com.ironhack.IHJavaWeek1Day4.models;

import javax.persistence.*;

// Ejemplo de Assignment con relacion One To One

@Entity
public class FinalAssignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int score;
    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;


    public FinalAssignment() {
    }

    public FinalAssignment(String name, int score, Student student) {
        this.name = name;
        this.score = score;
        this.student = student;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
