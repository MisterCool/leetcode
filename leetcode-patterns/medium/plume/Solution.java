package plume;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    private int deleteCount = 0;
    public int solution(int[] A) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < A.length; i++){
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }


        List<Integer> numberCount = map.values().stream().sorted().collect(Collectors.toList());
        int[] cache = new int[numberCount.size()];
        Arrays.fill(cache, -1);
        return dfs(0, numberCount, cache);
    }

    public int dfs(int index, List<Integer> numberCount, int[] cache) {

        if(index >= numberCount.size() || new HashSet(numberCount).size() == numberCount.size()) {
            return deleteCount;
        }

        if(cache[index] != -1) return cache[index];

        numberCount.set(index, numberCount.get(index) - 1);

        if(numberCount.get(index) == 0) {
            numberCount.remove(index);
            index--;
        }

        deleteCount++;

        int delete = dfs(index + 1, numberCount, cache);

        int notDelete = dfs(index + 1, numberCount, cache);

        if(index < 0) return Math.min(delete, notDelete);
        return  cache[index] = Math.min(delete, notDelete);
    }
}
