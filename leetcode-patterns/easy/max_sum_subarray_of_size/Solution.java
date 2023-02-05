package max_sum_subarray_of_size;

import java.util.List;

public class Solution {

    public static long maximumSumSubarray(int K, List<Integer> Arr, int N) {
        long maxSum = 0;
        int windowStart = 0;
        long windowSum = 0;
        for (int windowEnd = 0; windowEnd < N; windowEnd++) {
            windowSum += Arr.get(windowEnd);
            if (windowEnd >= K - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= Arr.get(windowStart);
                windowStart++;
            }
        }

        return maxSum;
    }
}

