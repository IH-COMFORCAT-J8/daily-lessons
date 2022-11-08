public class Main {
    public static void main(String[] args) {

        byte myFirstVariable = 127;
        short myShort = 3789;
        int myInt = 19999;
        long myLong = 123123123L;
        double myDouble = 20.50;
        float myFloat = 123123123.123123F;

        boolean isTrue = true;
        char myCharacter = 'j';
        //Comentario simple
        /*
        Comentario en bloque
        Sigo comentando

         */
        String myString = "Hello!";
        double suma = suma(20.50, 50.590);

        System.out.println(suma);
        System.out.println(suma(20.50, 50.590));

        double myNumber = 20.89;

        int numberToInt = (int) myNumber;
        System.out.println(numberToInt);


        /*
        -- Strings --
        Create a method named `productFormatter` that receives a String
        name `productName` and a String `date` as parameters. This method
        should return the productName trimmed, change spaces by `_` and
        append the date at the end of the string. The result must be given in uppercase.
         */

        System.out.println(myString.charAt(4));
        System.out.println(myString.contains("class"));
        int n = 10;
        Integer n2 = n;
        String productFormatted = productFormatter("    Botas de esqui   ", "27/09/2023");
        System.out.println(productFormatted.concat("Hola clase!"));

        // Operaciones matemáticas
        double x = 12;
        double y = 25;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);

        if (x == 10) {
            if (y == 25) {
                System.out.println("x vale 10 y y vale 25");
            }
        }
        String name = "Jaume";
        String anotherName = new String("Jaume");
        String surname;

        if (name.equals(anotherName)) {
            System.out.println("Se llama Jaume");
        } else {
            System.out.println("No se llama Jaume");
        }

        if (x == 0) {
            System.out.println("X vale 0");
        } else if (x == 1) {
            System.out.println("x vale 1");
        } else if (x == 2) {
            System.out.println("x vale 2");
        }

        int dayOfTheWeek = 3;
        switch (dayOfTheWeek) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("Otro día");
        }

        String weekendOrWeekday = dayOfTheWeek <=5 ? "Weekday" : "Weekend ";

        if (dayOfTheWeek <= 5) {
            weekendOrWeekday = "Weekday";
        } else {
            weekendOrWeekday = "Weekend";
        }

    }




    private static String productFormatter(String productName, String date) {
        return productName
                .trim()
                .replace(" ", "_")
                .toUpperCase().concat("-")
                .concat(date);

    }
    public static double suma(double num1, double num2) {
        return num1 + num2;
    }

}

