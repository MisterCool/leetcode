package minimum_size_subarray_sum;


//time complexity O(n)
public class Solution {

    public int minSubArrayLen(int target, int[] nums) {
        int minCountLength = Integer.MAX_VALUE;
        int windowStart = 0;
        int windowSum = 0;
        int count = 0;
        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            windowSum += nums[windowEnd];
            count++;
            while (windowSum >= target) {
                minCountLength = Math.min(minCountLength, count);
                windowSum -= nums[windowStart];
                windowStart++;
                count--;
            }
        }

        return minCountLength == Integer.MAX_VALUE ? 0 : minCountLength;
    }
}
