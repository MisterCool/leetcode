package move_zeroes;

public class Solution {
    public void moveZeroes(int[] nums) {
        int countZero = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) countZero++;

            if(countZero != 0 && nums[i] != 0) {
                swap(i - countZero, i, nums);
            }
        }
    }

    public void swap(int start, int end, int[] nums) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
