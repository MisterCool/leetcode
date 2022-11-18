package best_time_to_buy_and_sell_stock;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/solution/
public class Solution {

    public static int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            profit = Math.max(profit, prices[i] - minPrice);
        }

        return profit;
    }
}
