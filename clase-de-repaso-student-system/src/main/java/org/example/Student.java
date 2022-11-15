package org.example;

import java.util.*;

public abstract class Student {

    private String name;
    private String surname;
    private int age;
    private List<Subject> subjects = new ArrayList<>();

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public double getAverageScore() {
        double sum = 0;

        // for int i = 0; i < subjects.length; i++

        //subject = subjects[i]
        for (Subject subject : subjects) {
            sum += subject.getScore();
        }

        double average = sum / subjects.size();
        return average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", subjects=" + subjects +
                '}';
    }
}
