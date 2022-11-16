package find_all_numbers_disappeared_in_an_array;

import java.util.ArrayList;
import java.util.List;


// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/discuss/777978/Java-time-O(n)-space-O(1)

// main idea is used numbers in array as indexes
public class Solution {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i : nums) {
            int index = Math.abs(i);
            if (nums[index - 1] > 0) {
                nums[index - 1] *= -1;
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }
        return res;
    }
}
