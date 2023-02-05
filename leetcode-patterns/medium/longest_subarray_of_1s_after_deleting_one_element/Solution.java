package longest_subarray_of_1s_after_deleting_one_element;

public class Solution {
    public int longestSubarray(int[] nums) {
        int startWindow = 0;
        int count = 0;
        int countZero = 0;
        for(int endWindow = 0; endWindow < nums.length; endWindow++) {
            if(nums[endWindow] == 0) {
                countZero++;
            }

            while(countZero > 1) {
                if(nums[startWindow] == 0){
                    countZero--;
                }
                startWindow++;
            }
            count = Math.max(count, endWindow - startWindow + 1 - countZero);
        }

        if(count == nums.length) return count - 1;
        return count;
    }
}
