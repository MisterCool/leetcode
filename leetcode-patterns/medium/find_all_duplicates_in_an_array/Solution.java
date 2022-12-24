package find_all_duplicates_in_an_array;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]);
            if (nums[index - 1] < 0) result.add(index);
            nums[index - 1] *= -1;
        }

        return result;
    }
}
