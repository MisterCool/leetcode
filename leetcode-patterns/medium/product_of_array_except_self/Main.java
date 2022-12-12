package product_of_array_except_self;

import java.util.Arrays;

import static product_of_array_except_self.Solution.productExceptSelf;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{6, 2, 3, 4};

        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
