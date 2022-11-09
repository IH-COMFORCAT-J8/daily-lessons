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

         */


        /*
        Scanner reader = new Scanner(new File("oscar_age_female.csv"));

        FileWriter writer = new FileWriter("result.txt", true);
        Name: Janet Gaynor
        Year: 1928
        Age: 22
        Movie: Seventh Heaven Street Angel and Sunrise: A Song of Two Humans


        String firstLine = reader.nextLine();
        System.out.println("Saltándonos la primera linea: \n " + firstLine);
        while (reader.hasNextLine()) {
            String[] line = reader.nextLine().split(", ");
            writer.write("Name: " + line[3] + "\n");
            writer.write("Year: " + line[1] + "\n");
            writer.write("Age: " + line[2] + "\n");
            writer.write("Movie: " + line[4] + "\n");
            writer.write("================== \n");

        }


        reader.close();
        writer.close();

         */

        Car myCar = new Car( -10, "Toyota", "Yaris", "2568JDF", true);

        Car myOtherCar = new Car("Ford", "Fiesta");

        System.out.println(myCar.getBrand());

        myCar.setBrand("Lexus");

        System.out.println(myCar.getBrand());

        myCar.travel(150);
        myCar.travel(10);
        myCar.travel();








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
