package target_sum;

public class Solution {

    public int findTargetSumWays(int[] nums, int target) {

        return dfs(0, nums, 0, target);
    }

    public int dfs(int index, int[] nums, int sum, int target) {
        if(sum == target && index == nums.length) {
            return 1;
        }

        if(index >= nums.length) return 0;


        return dfs(index + 1, nums, nums[index] + sum, target) +
            dfs(index + 1, nums, -nums[index] + sum, target);
    }
}
