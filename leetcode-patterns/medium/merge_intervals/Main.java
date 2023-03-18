package merge_intervals;


import java.util.Arrays;

// https://leetcode.com/problems/merge-intervals/description/
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new Solution().merge(new int[][]{{1, 3}, {3, 6}, {8, 10}, {9, 18}})));
    }
}
