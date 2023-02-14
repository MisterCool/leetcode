package longest_increasing_subsequence;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/longest-increasing-subsequence/solutions/1326552/optimization-from-brute-force-to-dynamic-programming-explained/
public class Solution {

    public int lengthOfLIS(int[] nums) {
        List<Integer> seq = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if(seq.isEmpty() || seq.get(seq.size() - 1) < nums[i]){
                seq.add(nums[i]);
            } else {
                seq.set(binarySearch(seq, nums[i]), nums[i]);
            }
        }

        return seq.size();
    }


    public int lengthOfLISBruteForce(int[] nums) {

        return dfs(0, nums, Integer.MIN_VALUE);
    }

    // brute-force
    private int dfs(int index, int[] nums, int prev) {

        if (index >= nums.length) {
            return 0;
        }

        int curr = nums[index];
        int pick = 0;

        if (curr > prev) {
            pick = 1 + dfs(index + 1, nums, curr);

        }

        int notPick = dfs(index + 1, nums, prev);

        return Math.max(pick, notPick);
    }

    // brute-force
    private int dfsWithMemo(int index, int[] nums, int prev, int[][] dp) {

        if (index >= nums.length) {
            return 0;
        }

        int curr = nums[index];
        int pick = 0;

        if (curr > prev) {
            pick = 1 + dfs(index + 1, nums, curr);

        }

        int notPick = dfs(index + 1, nums, prev);

        return Math.max(pick, notPick);
    }

    public int binarySearch(List<Integer> list, int num) {
        int start = 0;
        int end = list.size() - 1;
        int mid = start + (end - start) / 2;;
        while (start <= end) {
            if (list.get(mid) < num) start = mid + 1;
            else end = mid - 1;
            mid = start + (end - start) / 2;
        }

        return mid;
    }
}
