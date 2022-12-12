package squares_of_a_sorted_array;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] nums = new int[]{-7, -3, 2, 3, 11};
        int[] nums1 = new int[]{-10000, -9999, -7, -5, 0, 0, 10000};

        System.out.println(Arrays.toString(Solution.sortedSquares(nums)));
        System.out.println(Arrays.toString(Solution.sortedSquares(nums1)));
    }
}
