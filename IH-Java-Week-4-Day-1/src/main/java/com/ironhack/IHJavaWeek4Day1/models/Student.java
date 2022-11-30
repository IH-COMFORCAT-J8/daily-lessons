package com.ironhack.IHJavaWeek4Day1.models;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.*;

import java.time.*;
@Entity
public class Student {

    @Id
    // Not empty
    private String dni;
    // Not empty
    private String name;
    // Not empty
    private String surname;
    //format day-month-year -> 13-01-1989

    @JsonFormat(pattern = "dd-MM-yyyy")
    @Past
    private LocalDate dateOfBirth;
    //Max 100 min 10
    @Min(value = 10)
    @Max(value = 100)
    private int numCredits;

    public Student(String dni, String name, String surname, LocalDate dateOfBirth, int numCredits) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.numCredits = numCredits;
    }

    public Student() {

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getNumCredits() {
        return numCredits;
    }

    public void setNumCredits(int numCredits) {
        this.numCredits = numCredits;
    }
}
