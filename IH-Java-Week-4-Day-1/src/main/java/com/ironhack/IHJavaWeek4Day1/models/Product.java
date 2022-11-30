package com.ironhack.IHJavaWeek4Day1.models;

import com.ironhack.IHJavaWeek4Day1.enums.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.hibernate.annotations.*;

import java.math.*;

@Entity
//Utilizamos Dynamic update para actualizar una sola celda, en lugar de todas las celdas de un elemento
@DynamicUpdate
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    private String name;
    //Limitamos el número máximo de enteros y fracciones

    @Digits(integer = 4, fraction = 2)
    private BigDecimal price;
    @Enumerated(EnumType.STRING)
    private Category category;
    @Enumerated(EnumType.STRING)
    private Department department;
    @ManyToOne
    private Seller seller;

    public Product(String name, BigDecimal price, Category category, Department department, Seller seller) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.department = department;
        this.seller = seller;
    }

    public Product() {
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
