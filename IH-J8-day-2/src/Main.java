import java.util.*;

public class Main {

    public static void main(String[] args) {
        int number = 1;
        double decimalNumber = 1.4;

        String name = "Alejandro";
        int[] numbers = new int[10];
        int[] numbers2 = {1, 5, 7, 3, 6};
        String[] names = new String[10];


        System.out.println("===Bucle for===");
        // Bucle for
        for (int i = numbers2.length - 1; i >= 0; i--) {
            System.out.println(numbers2[i]);
        }

        // Bucle for each
        System.out.println("===Bucle for each===");

        for (int n : numbers2) {
            System.out.println(n);
        }

        System.out.println("===Bucle while===");

        int index = 12;


        while (index < numbers2.length) {
            System.out.println(numbers2[index++]);

            // index++ es lo mismo que index = index + 1;
        }

        do {
            System.out.println("Hola clase");
            index++;

        } while (index < 10);

        System.out.println("===Ejercicio 1===");
        int[] array = {1, 4, 5, 7, 8, 9};


        for (int i : multiplyElements(array)) {
            System.out.println(i);
        }

        array = new int[]{1, 4, 5, 7, 8, 9};
        System.out.println("===Ejercicio 2===");

        int[] resultInvertArray = invertArray(array);

        System.out.println(Arrays.toString(resultInvertArray));

        int newNumber = 5;


        System.out.println("=== Ejercicio 3===");
        int resultSumNumbers = sumAllNumbers(newNumber);

        System.out.println(resultSumNumbers);

        System.out.println("===Ejercicio 4===");

        int[] oddAndEvenNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 10};

        int[] evenNumbers = getEvenNumbers(oddAndEvenNumbers);

        System.out.println(Arrays.toString(evenNumbers));



    }

    private static int[] getEvenNumbers(int[] array) {

        int size = 0;

        for (int i: array) {
            if (i % 2 == 0) {
                size++;
            }
        }
        int[] result = new int[size];
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] %2 == 0) {
                result[counter++] = array[i];
            }

        }
        return result;

    }

    private static int sumAllNumbers(int number) {

        int result = 0;
        for (int i = 1; i <= number; i++) {
            result += i;
            //result = result + i;

        }
        return result;

    }


    public static int[] multiplyElements(int[] elements) {

        int firstPosition = elements[0];
        for (int i = 0; i < elements.length; i++) {

            if (i < elements.length - 1) {
                elements[i] = elements[i] * elements[i + 1];
            } else {
                elements[i] = elements[i] * firstPosition;
            }

        }

        return elements;
    }

    public static int[] invertArray(int[] array) {

        int[] result = new int[array.length];

        int counter = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            result[counter++] = array[i];

        }

        return result;
    }
}
