import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] array = {5, 2, 1, 4, -10, -10};


        System.out.println("===Exercise 1===");
        System.out.println(difference(array));

        System.out.println("===Exercise 2===");
        findTwoSmallest(array);

        System.out.println("===Exercise 3===");

        double expressionResolved = resolveExpression(2, 3);
        System.out.println(expressionResolved);
        
        
        


    }

    public static double resolveExpression(double x, double y) {

        return Math.pow(x, 2) + Math.pow(4*y/5-x, 2);


    }
    
    public static void findTwoSmallest(int[] numbers) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < smallest) {
                secondSmallest = smallest;
                smallest = numbers[i];
            } else if( numbers[i] < secondSmallest && numbers[i] > smallest) {
                secondSmallest = numbers[i];
            }
        }

        System.out.println("The smallest number is " + smallest);
        System.out.println("The second smallest number is " + secondSmallest);
            

        
    }

    public static int difference(int[] numbers) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) smallest = numbers[i];
            if (numbers[i] > largest) largest = numbers[i];

        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);

        return largest - smallest;


    }
}
