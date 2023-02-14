package three_sum_closest;

import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = 0;
        int diff = Integer.MAX_VALUE;

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right) {
                int currResult = nums[left] + nums[i] + nums[right];
                int currDiff = Math.abs(currResult - target);
                if(currDiff <= diff) {
                    diff = currDiff;
                    result = currResult;
                }
                if(currResult > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return result;
    }
}
