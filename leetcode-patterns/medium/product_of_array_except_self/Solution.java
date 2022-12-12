package product_of_array_except_self;

public class Solution {

    // the main idea -
    // Numbers:     2    3    4     5
    // Lefts:            2  2*3 2*3*4
    // Rights:  3*4*5  4*5    5

    // fill empty 1

    // Numbers:     2    3    4     5
    // Lefts:       1    2  2*3 2*3*4
    // Rights:  3*4*5  4*5    5


    // left we will save in input array but right in variable
    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            res[i] = nums[i - 1] * res[i - 1];
        }

        int right = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] = res[i] * right;
            right = right * nums[i];
        }

        return res;
    }
}
