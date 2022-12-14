import java.math.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Vehicle vehicle = new Car("Toyota", "Yaris", "456789JKL", true, false);

        double x = 0.3;
        double y = 0.6;

        System.out.println(x + y);

        BigDecimal x1 = new BigDecimal(x);
        BigDecimal x2 = new BigDecimal(y);

        System.out.println((x1.add(x2)).setScale(2, RoundingMode.HALF_UP));
        
        x1.subtract(x2).multiply(new BigDecimal(".8"));

        IntArrayList intArrayList = new IntArrayList();

        for (int i = 0; i < 25; i++) {
            intArrayList.add(i);
        }

        Arrays.stream(intArrayList.getArray()).forEach((e) -> {
            System.out.println(e);
        });

        int[] nums = {4, 1, 3, 2, 5};
        int target = 52;



    }


}

