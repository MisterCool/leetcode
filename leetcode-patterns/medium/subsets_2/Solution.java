package subsets_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/subsets-ii/solutions/882468/simple-java-solution-based-on-backtracking-with-comments-1ms/
public class Solution {

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        subsetsWithDup(0, nums, list, result);
        return result;
    }


    public static void subsetsWithDup(int index, int[] nums, List<Integer> subset, List<List<Integer>> result) {
        result.add(new ArrayList<>(subset));
        if(index == nums.length) return;

        for(int i = index; i < nums.length; i++) {
            subset.add(nums[i]);
            subsetsWithDup(i + 1, nums, subset, result);
            subset.remove(subset.size() - 1);
            while (i + 1 < nums.length && nums[i] == nums[i + 1]){
                i++;
            }
        }
    }
}
