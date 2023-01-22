package coin_change;

// https://leetcode.com/problems/coin-change/solutions/1569308/java-explained-with-example-dp/
// https://leetcode.com/problems/coin-change/solutions/778548/c-dp-solution-explained-100-time-100-space/
public class Solution {

    public int coinChange(int[] coins, int amount) {
        if(amount == 0) return 0;
        int[] dp = new int[amount + 1];
        dp[0] = 0;

        for (int i = 1; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int coin : coins) {
                if(i - coin < 0) continue;
                if(dp[i - coin] != Integer.MAX_VALUE)
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }

        return dp[amount] != Integer.MAX_VALUE ? dp[amount] : -1;
    }
    
}
