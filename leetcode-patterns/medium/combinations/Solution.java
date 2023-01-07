package combinations;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> list = new ArrayList<>();

        backtrack(1, n, k, result, list);

        return result;
    }

    private void backtrack(int index, int n, int k, List<List<Integer>> result, List<Integer> list) {
        if(list.size() == k) {
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i = index; i < n + 1; i++){
            list.add(i);
            backtrack(i + 1, n, k, result, list);
            list.remove(list.size() - 1);
        }
    }
}
