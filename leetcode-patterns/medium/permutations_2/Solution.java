package permutations_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, list, result, new boolean[nums.length]);

        return result;
    }

    public static  void backtrack(int[] nums, List<Integer> list, List<List<Integer>> result, boolean[] visited) {
        if(list.size() == nums.length){
            result.add(new ArrayList<>(list));
        }

        for(int i = 0; i < nums.length; i++){
            if(visited[i]) continue;
            list.add(nums[i]);
            visited[i] = true;
            backtrack(nums, list, result, visited);
            list.remove(list.size() - 1);
            visited[i] = false;
            while(i + 1 < nums.length && nums[i] == nums[i + 1]) {
                i++;
            }
        }
    }
}
