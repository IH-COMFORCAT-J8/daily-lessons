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
    private List<Account> accounts;


}
