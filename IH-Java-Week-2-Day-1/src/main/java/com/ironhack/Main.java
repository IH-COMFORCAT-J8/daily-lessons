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

    }
}
