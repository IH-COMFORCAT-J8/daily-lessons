import java.util.*;

public class Main {
    public static void main(String[] args) {

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

        System.out.println("Introduce la frase que quieres evaluar: ");

        String phrase = input.nextLine().toLowerCase();

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
