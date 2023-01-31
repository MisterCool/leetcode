package house_robber;

import java.util.Arrays;

// on every step we decide rob or not rob it is similar on backtracking
// https://leetcode.com/problems/house-robber/solutions/156523/From-good-to-great.-How-to-approach-most-of-DP-problems.
public class Solution {

    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return dfs(0, nums, dp);
    }


    private int dfs(int index, int[] nums, int[] dp) {
        if(index >= nums.length) return 0;

        if(dp[index] != -1) return dp[index];

        int rob = nums[index] + dfs(index + 2, nums, dp);
        int noRob = dfs(index + 1, nums, dp);

        dp[index] = Math.max(rob, noRob);
        return dp[index];
    }
}
