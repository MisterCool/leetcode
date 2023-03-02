package merge_intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public int[][] merge(int[][] intervals) {

        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        for(int i = 0; i < intervals.length; i++) {
            if(list.isEmpty()) {
                list.add(intervals[i]);
                continue;
            }

            int[] firstArray = list.get(list.size() - 1);

            int s1 = firstArray[0];
            int e1 = firstArray[1];

            int[] secondArray = intervals[i];
            int s2 = secondArray[0];
            int e2 = secondArray[1];

            if(s2 <= e1) {
                list.remove(firstArray);
                list.add(new int[] {s1, Math.max(e1, e2)});
            } else {
                list.add(new int[] {s2, e2});
            }
        }

        return list.toArray(int[][]::new);
    }
}
