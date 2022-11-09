import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        /*

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        String name = input.nextLine();
        System.out.println("Bienvenido " + name);

        int age;

        age = input.nextInt();

        while (age < 0 || age > 130) {
            System.err.println("Edad no válida, por favor introduce una edad dentro del rango:");
            age = input.nextInt();
        }
         */

        Scanner input = new Scanner(System.in);

       // System.out.println("Introduce la frase que quieres evaluar: ");

        // String phrase = input.nextLine();
        // countVowels(phrase);

        FileWriter writer = new FileWriter("demo.txt", false);

        writer.write("Patata\n");
        writer.write("Cebolla\n");
        writer.write("Aceite\n");
        writer.write("Huevos\n");

        writer.close();

        String route = "demo.txt";
        File shoppingList = new File(route);
        Scanner reader = new Scanner(shoppingList);

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            for (String word : line.split(" ")) {
                if (word.startsWith("A")) {
                    System.out.println("La palabra " + word + " empieza por A");
                } else {
                    System.err.println("La palabra " + word + " no empieza por A");
                }

            }
        }

        reader.close();


    }

    public static void countVowels(String input) {

        String phrase = input.toLowerCase();

        String[] words = phrase.split(" ");
        int counter = 0;
        for (String word : words) {
            char firstCharacter = word.charAt(0);

            if (firstCharacter == 'a' || firstCharacter == 'e'
                    || firstCharacter == 'i' || firstCharacter == 'o'
                    || firstCharacter == 'u') {
                counter++;

            } else {
                System.err.println(word + " no empieza por vocal.");
            }

        }
        System.out.println("Número de palabras que empiezan por vocal: " + counter);

    }

}
