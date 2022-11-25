package com.ironhack.netflix.models;

import jakarta.persistence.*;

import java.util.*;

@Entity
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    //"plan" hace referencia al atributo de la clase account donde hemos definido la relación
    @OneToMany(mappedBy = "plan")
    private List<Account> accounts = new ArrayList<>();

    public Plan( String name, Double price) {

        this.name = name;
        this.price = price;
    }

    public Plan() {
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }


}
