package contains_duplicate;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static boolean containsDuplicate(int[] nums) {
        List<Integer> numsWithoutDuplicates = Arrays.stream(nums).distinct().boxed().toList();

        return numsWithoutDuplicates.size() != nums.length;
    }
}
