package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        User user = new User(1l, "Anna", Status.BANNED);

        if (user.getStatus().equals(Status.BANNED)) {
            System.out.println("No puedes jugar");
        }

        /*
        Lista de usuarios:
            - User1
            - User2
            - User3
        Mapa de usuarios:
            -id, usuario1
            -id, usuario2
            -id, usuario3
         */

        Map<String, String> nationalLeaders = new HashMap<>();

        nationalLeaders.put("France", "Emmanuel Macron");
        nationalLeaders.put("Spain", "Pedro Sánchez");
        nationalLeaders.put("USA", "Joe Biden");

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Navegando a través de las claves");
        for (String key : nationalLeaders.keySet()) {
            System.out.println("País: " + key + " presidente: " + nationalLeaders.get(key));
        }
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Navegando a través de los valores");
        for (String value : nationalLeaders.values()) {
            System.out.println(value);
        }
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("Bucle foreach con expresión lambda");
        nationalLeaders.forEach((k, v) ->{
            System.out.println("El país " + k + " está presidido por " + v);
        });



        System.out.println("Extrayendo un valor dada su clave");
        System.out.println(nationalLeaders.get("USA"));

        nationalLeaders.put("USA", "Donald Trump");
        System.out.println(nationalLeaders.get("USA"));

        Map<String, Country> countries = new HashMap<>();

        countries.put("USA", new Country("United States of America", "Washington DC", 300000000, "Joe Biden"));
        countries.put("Spain", new Country("Reino de España", "Madrid", 46000000, "Pedro Sánchez"));

        Country country = countries.get("Spain");





    }
}
