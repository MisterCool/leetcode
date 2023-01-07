package permutations;

import java.util.ArrayList;
import java.util.List;
// https://leetcode.com/problems/permutations/solutions/685868/dfs-backtracking-python-java-javascript-picture/
// time complexity O(N * N!)
public class Solution {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        backtrack(nums, list, result, new boolean[nums.length]);
        return result;
    }

    private static void backtrack(int[] nums, List<Integer> list, List<List<Integer>> result, boolean[] visited) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if(visited[i]) continue;
            list.add(nums[i]);
            visited[i] = true;
            backtrack(nums, list, result, visited);
            list.remove(list.size() - 1);
            visited[i] = false;
        }
    }
}
