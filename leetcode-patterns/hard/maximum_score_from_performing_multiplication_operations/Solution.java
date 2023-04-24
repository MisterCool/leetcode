package maximum_score_from_performing_multiplication_operations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int maximumScore(int[] nums, int[] multipliers) {

        List<Integer> result = new ArrayList<>();

        for(int i: nums) {
            result.add(i);
        }
        return dfs(0, result, multipliers);
    }

    private int dfs(int index, List<Integer> nums, int[] multipliers) {

        if(nums.isEmpty() || index >= multipliers.length) return 0;

        int pickFirst = nums.get(index) * multipliers[index] + dfs(index + 1, nums, multipliers);
        int pickLast = nums.get(nums.size() - 1 - index) * multipliers[index] + dfs(index + 1, nums, multipliers);


        return Math.max(pickFirst, pickLast);
    }
}
