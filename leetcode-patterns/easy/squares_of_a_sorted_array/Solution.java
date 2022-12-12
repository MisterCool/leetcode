package squares_of_a_sorted_array;

public class Solution {

    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        int end = nums.length - 1;
        int start = 0;
        while (start <= end) {
            if (nums[start] * nums[start] > nums[end] * nums[end]) {
                result[end - start] = nums[start] * nums[start];
                start++;
            } else {
                result[end - start] = nums[end] * nums[end];
                end--;
            }
        }

        return result;
    }
}
