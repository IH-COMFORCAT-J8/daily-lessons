package com.example.demo.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;


    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "ENUM('GOLD', 'SILVER', 'NONE')")
    private CustomerStatus customerStatus;


    public Customer(String name, CustomerStatus customerStatus) {
        this.name = name;
        this.customerStatus = customerStatus;
    }

    public Customer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerStatus getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(CustomerStatus customerStatus) {
        this.customerStatus = customerStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) && Objects.equals(name, customer.name) && customerStatus == customer.customerStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, customerStatus);
    }
}
