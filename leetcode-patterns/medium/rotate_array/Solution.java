package rotate_array;


// the main idea
// we need to use 3 times reverse function, example
// nums = 1 2 3 4 k = 2
// 1 time - reverse a whole array -> 4 3 2 1
// 2 time - reverse from 0 index to k -> 3 4 2 1
// 3 time - reverse from k index to last index -> 3 4 1 2
public class Solution {
    public void rotate(int[] nums, int k) {
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k % nums.length - 1); // use modulo because k can be more than nums.length
        reverse(nums, k % nums.length, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        int left = start;
        int right = end;

        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
