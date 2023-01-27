package com.ironhack.repasofinal.models;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer quantity;
    @ManyToOne
    @JsonIgnore
    private Department department;

    public Product(String name, Integer quantity, Department department) {
        this.name = name;
        this.quantity = quantity;
        this.department = department;
    }
}
