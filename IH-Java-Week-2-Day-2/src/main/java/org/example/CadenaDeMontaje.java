package org.example;

import java.io.*;

public class CadenaDeMontaje {

    public static void main(String[] args) {

    }

    public static void pintarPuerta(String nombre) throws IOException {

        try {
            int nivelDePintura = cogerPintura();
        } catch (IOException e) {
            System.out.println("No puedo conseguir pintura, la busco en otro sitio");
        }

        if (nombre.length() > 10) {
            System.out.println("Pintando puerta");
        } else {
            System.out.println("No puedo");
        }
    }

    public static int cogerPintura() throws IOException {
        return 100;
    }

}
