package com.example.lab306.models;

import javax.persistence.Entity;

@Entity
public class BillableTask extends Task{

    private int hourlyRate;

    public BillableTask(String title, String dueDate, boolean status, int hourlyRate) {
        super(title, dueDate, status);
        this.hourlyRate = hourlyRate;
    }

    public BillableTask() {
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
