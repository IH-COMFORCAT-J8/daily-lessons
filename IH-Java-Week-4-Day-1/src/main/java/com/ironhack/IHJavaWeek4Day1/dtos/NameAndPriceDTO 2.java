package com.ironhack.IHJavaWeek4Day1.dtos;

import java.math.*;

public class NameAndPriceDTO {
    private String name;
    private BigDecimal price;

    public NameAndPriceDTO(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public NameAndPriceDTO() {
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
}
