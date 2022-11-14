package com.ironhack;

public class InvoiceItem {

    private String name;
    private String price;

    public InvoiceItem(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "InvoiceItem{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
