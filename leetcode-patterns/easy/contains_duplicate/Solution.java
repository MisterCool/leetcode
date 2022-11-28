package contains_duplicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static boolean containsDuplicate(int[] nums) {
        List<Integer> numsWithoutDuplicates = Arrays.stream(nums).distinct().boxed().collect(Collectors.toList());

        return numsWithoutDuplicates.size() != nums.length;
    }
}
