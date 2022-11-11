import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] nums = {2, 1, 4, 3, 6, 7};
        int target = 52;

        int[] result = balancer(nums, target);

        System.out.println(Arrays.toString(result));

        IntArrayList intArrayList = new IntArrayList();

        for (int i = 1; i < 27; i++) {
            intArrayList.add(i);

        }

        System.out.println(Arrays.toString(intArrayList.getArray()));


    }

    public static int[] balancer(int[] nums, int sum) {

        int arraySum = 0;

        for (int i : nums) {
            arraySum += i;
        }

        while (sum > arraySum) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < min) {
                    min = nums[i];
                }
            }
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == min) {
                    nums[i]++;
                    break;
                }
            }
            arraySum++;
        }
        return nums;
    }

    public static int[] balancerOneLoop(int[] nums, int sum) {

        int arraySum = 0;

        for (int i : nums) {
            arraySum += i;
        }

        while (sum > arraySum) {
            int position = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < nums[position]) {
                    position = i;
                }
            }
            nums[position]++;
            arraySum++;

        }
        return nums;
    }


}
