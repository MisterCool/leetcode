package combination_sum_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0, candidates, result, list, target);
        return result;
    }

    private void backtrack(int index, int[] candidates, List<List<Integer>> result, List<Integer> list, int target) {
        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if(candidates[i] > target) continue;
            list.add(candidates[i]);
            backtrack(i + 1, candidates, result, list, target - candidates[i]);
            list.remove(list.size() - 1);
            while (i + 1 < candidates.length && candidates[i] == candidates[i + 1]) {
                i++;
            }
        }
    }
}
