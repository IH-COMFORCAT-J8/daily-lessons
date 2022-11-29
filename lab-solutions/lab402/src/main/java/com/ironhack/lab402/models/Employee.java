package com.ironhack.lab402.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Employee {

    @Id
    private Long employee_id;

    private String department;

    private String name;
    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToMany(mappedBy = "admittedBy", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Patient> patientList;

    public Employee() {
    }

    public Employee(Long employee_id, String department, String name, Status status) {
        this.employee_id = employee_id;
        this.department = department;
        this.name = name;
        this.status = status;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }

    public Long getEmployee_id() {
        return employee_id;
    }



    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
