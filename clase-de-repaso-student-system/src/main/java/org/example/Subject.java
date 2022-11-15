package org.example;

public class Subject {

    private String name;
    private double score;

    public Subject(String name, double score) {
        this.name = name;
        setScore(score);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score < 0 || score > 10) {
            throw new IllegalArgumentException("La nota debe ser mayor que 0 y menor o igual que 10");
        }
        this.score = score;
    }
}
