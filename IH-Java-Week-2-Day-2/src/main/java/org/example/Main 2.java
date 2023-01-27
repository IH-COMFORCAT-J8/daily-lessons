package org.example;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
/*

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

 */

        try {
            System.out.println(concatenateName("Jaume", null));
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("Adios");

        int product = 0;
        long longProduct = 0;

        try {
            product = MathLibrary.multiply(Integer.MAX_VALUE, 2);
        } catch (IllegalArgumentException e) {
            longProduct = MathLibrary.multiply((long)Integer.MAX_VALUE, 2l);
        }

        if (product != 0) {
            System.out.println("Int: " + product);
        } else {
            System.out.println("Long: " + longProduct);
        }

        System.out.println(Integer.MAX_VALUE);
       // System.out.println(MathLibrary.multiply(Integer.MAX_VALUE, 2));

        Book book1 = new Book(12341203812309l, "El Resplandor", "Stephen King", 1979);
        Book book2 = new Book(12341203812309l, "El Resplandor", "Stephen King", 1980);

        System.out.println(book1.hashCode() == book2.hashCode());


    }
    public static String concatenateName(String name, String surname) throws IllegalArgumentException {

        if (name == null || surname == null || name.isEmpty() || surname.isEmpty()) {
            throw new IllegalArgumentException("El nombre y el apellido deben ser válidos");
        }

        return name + " " + surname;
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
