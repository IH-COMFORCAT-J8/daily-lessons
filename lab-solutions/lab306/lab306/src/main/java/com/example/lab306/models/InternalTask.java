package com.example.lab306.models;

import javax.persistence.Entity;

@Entity
public class InternalTask extends Task{

    public InternalTask(String title, String dueDate, boolean status) {
        super(title, dueDate, status);
    }

    public InternalTask() {
    }
}
