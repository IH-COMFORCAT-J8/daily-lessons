package com.ironhack;


import com.google.gson.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        InvoiceItem item1 = new InvoiceItem("Rum", "15");
        InvoiceItem item2 = new InvoiceItem("Coca Cola", "2");
        InvoiceItem item3 = new InvoiceItem("Ice", "2");

        ArrayList<InvoiceItem> invoiceItems = new ArrayList<>();
        invoiceItems.add(item1);
        invoiceItems.add(item2);
        invoiceItems.add(item3);

        Invoice invoice = new Invoice("IH-Botellon-0001", 19.0, false, invoiceItems);

        Gson gson = new Gson();

        System.out.println("Object to Json");
        String invoiceJson = gson.toJson(invoice);

        System.out.println(invoiceJson);

        Invoice invoice1 = gson.fromJson(invoiceJson, Invoice.class);

        System.out.println("Json to object");
        System.out.println(invoice1);

        Book book1 = new Book("Harry Potter y la piedra filosofal", 370);
        Book book2 = new Book("El Resplandor", 430);
        Book book3 = new Book("El Señor de los Anillos", 410);

        List<Book> books = new Vector<>();

        books.add(book1);
        books.add(book2);
        books.add(book3);

        Author author = new Author("Stephen", "King", books);

        System.out.println(gson.toJson(author));
        
        double result = MathTools.sum(20, 30);
        System.out.println(result);

    }
}
