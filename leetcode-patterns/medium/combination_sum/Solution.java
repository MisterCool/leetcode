package combination_sum;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        backtrack(0, candidates, result, list, target);
        return result;
    }

    private void backtrack(int index, int[] nums, List<List<Integer>> result, List<Integer> list, int target) {

        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < nums.length; i++) {
            if(nums[i] > target) continue;
            list.add(nums[i]);
            backtrack(i, nums, result, list, target - nums[i]);
            list.remove(list.size() - 1);
        }
    }
}
