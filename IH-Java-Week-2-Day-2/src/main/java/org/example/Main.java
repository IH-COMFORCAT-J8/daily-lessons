package org.example;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3};

        System.out.println("Hola clase");

        try {
            System.out.println(numbers[4]);

        } catch (IndexOutOfBoundsException exception) {
            System.err.println("El número que quieres imprimir está fuera del tamaño del array");
        }


        System.out.println("Adiós clase");

        for (int i : numbers) {
            System.out.println(i);
        }


        System.out.println("Introduce el número que quieres convertir a entero:");

        int result = 0;
        boolean isValid = false;
        Scanner input = new Scanner(System.in);
        while (!isValid) {

            try {

                result = stringToInt(input.nextLine());
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("No válido, por favor introduce una edad en formato númerico. ");
            }
        }

        int ageInDays = convertToDays(result);

        System.out.println("Tienes " + ageInDays + " días de edad");


    }

    private static int convertToDays(int result) {
        if (result < 0) throw new IllegalArgumentException("La edad no puede ser negativa");

        return result * 365;
    }


    public static int stringToInt(String number) throws NumberFormatException {
        return Integer.parseInt(number);
    }


    public static void writeFile(String filename, String textToWrite) throws IOException {
        FileWriter writer = new FileWriter(filename);
        writer.write(textToWrite);


    }

    public static void printLength(String string) {
        System.out.println(string.length());
    }
}
