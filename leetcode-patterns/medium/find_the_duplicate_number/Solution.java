package find_the_duplicate_number;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    // O(n) memory
    public static int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) return nums[i];
            set.add(nums[i]);
        }

        return 0;
    }


    //     O(1) memory
    //* Focus on the indexes, not the values
    //  1. Find the mid point
    //  2. For each mid point, count how many elements are before. By count I don't mean the sum.
    //  3. If count > mid then search left side because count should not exeeded mid
    //  4. Else left = mid +1;
    public static int findDuplicateWithoutSpace(int[] nums) {

        int left = 0, right = nums.length - 1;


        while (left != right) {
            int middle = left + (right - left) / 2;

            int count = 0;

            for (int num : nums) {
                if (num <= middle) count++;
            }

            if (count > middle) {
                right = middle;
            } else
                left = middle + 1;
        }

        return left;
    }
}
