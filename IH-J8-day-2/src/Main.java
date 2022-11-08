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

        for(int n : numbers2) {
            System.out.println(n);
        }

        System.out.println("===Bucle while===");

        int index = 12  ;


        while (index < numbers2.length) {
            System.out.println(numbers2[index++]);

            // index++ es lo mismo que index = index + 1;
        }

        do {
            System.out.println("Hola clase");
            index++;

        } while (index <10);




    }
}
