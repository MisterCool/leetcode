package single_number;

// https://en.wikipedia.org/wiki/Exclusive_or
public class Solution {

    public static int singleNumber(int[] nums) {
        int first = nums[0];
        if (nums.length == 1) {
            return first;
        }

        for (int i = 1; i < nums.length; i++) {
            first ^= nums[i];
        }

        return first;
    }
}
