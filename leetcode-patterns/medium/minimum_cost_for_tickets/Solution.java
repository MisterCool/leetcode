package minimum_cost_for_tickets;

import java.util.Arrays;

public class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int[][] cache = new int[366][days.length];

        for (int[] ints : cache) {
            Arrays.fill(ints, -1);
        }

        return dfs(0, days, costs, 0, cache);
    }

    public int dfs(int index, int[] days, int[] costs, int expireDay, int[][] cache) {

        if(index == days.length) return 0;

        if(cache[expireDay][index] != -1) return cache[expireDay][index];

        int buyOnePass;
        int buySevenPass;
        int buyThirtyPass;


        buyOnePass = costs[0] + dfs(index + 1, days, costs, days[index] + 1, cache);

        if(days[index] >= expireDay) {
            buySevenPass = costs[1] + dfs(index + 1, days, costs, days[index] + 7, cache);
        } else {
            buySevenPass = dfs(index + 1, days, costs, expireDay, cache);
        }

        if(days[index] >= expireDay) {
            buyThirtyPass = costs[2] + dfs(index + 1, days, costs, days[index] + 30, cache);
        } else {
            buyThirtyPass = dfs(index + 1, days, costs, expireDay, cache);
        }

        return cache[expireDay][index] = Math.min(buyOnePass, Math.min(buySevenPass, buyThirtyPass));
    }
}
