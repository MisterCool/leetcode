package subsets;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/subsets/solutions/1766675/java-intuition-of-approach-backtracking/
public class Solution {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        subsets(0, nums, subset, result);
        return result;
    }

    public static void subsets(int index, int[] nums, List<Integer> subset, List<List<Integer>> result) {
        result.add(new ArrayList<>(subset));
        if(index == nums.length) return;

        for(int i = index; i < nums.length; i++) {
            subset.add(nums[i]);
            subsets(i + 1, nums, subset, result);
            subset.remove(subset.size() - 1);
        }
    }
}
