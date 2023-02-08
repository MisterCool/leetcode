package maximum_subarray;

public class Solution {

    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(max, sum);

            if (sum < 0) {
                sum = 0;
            }


        }
        return max;
    }

    // sliding window
    public int maxSubArray1(int[] nums) {
        if (nums.length == 1) return nums[0];
        int windowStart = 0;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            currSum += nums[windowEnd];
            maxSum = Math.max(currSum, maxSum);
            while (currSum < 0) {
                currSum -= nums[windowStart];
                windowStart++;
            }

        }

        return maxSum;
    }
}
