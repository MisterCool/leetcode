package combination_sum_2;

// https://leetcode.com/problems/combination-sum-ii/description/
public class Main {
    public static void main(String[] args) {
        int[] candidates = new int[]{10, 1, 2, 7, 6, 1, 5};
        System.out.println(new Solution().combinationSum2(candidates, 8));
    }
}
