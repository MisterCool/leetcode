package delete_and_earn;

import java.util.Arrays;

// https://leetcode.com/problems/delete-and-earn/solutions/1457449/java-reusing-house-robber-memoization/
public class Solution {

    public int deleteAndEarn(int[] nums) {

        int[] dp = new int[10001];

        for (int num : nums) {
            dp[num] += num;
        }

        return rob(dp);
    }

    public int rob(int[] nums) {
        int[] cache = new int[nums.length];
        Arrays.fill(cache, -1);
        return dfs(nums, 0, cache);
    }

    public int dfs(int[] nums, int index, int[] dp) {
        if (index >= nums.length) {
            return 0;
        }

        if (dp[index] != -1) return dp[index];

        int pick = nums[index] + dfs(nums, index + 2, dp);
        int notPick = dfs(nums, index + 1, dp);

        dp[index] = Math.max(pick, notPick);
        return dp[index];
    }
}