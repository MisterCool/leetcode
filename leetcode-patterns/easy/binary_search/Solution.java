package binary_search;

public class Solution {

    public static int search(int[] nums, int target) {
        return searchByIndexes(nums, target, 0, nums.length - 1);
    }

    public static int searchByIndexes(int[] nums, int target, int start, int end) {
        if (nums[start] == target) return start;
        if (nums[end] == target) return end;

        if (end - start == 1 || end - start == 0) return -1;
        if (target > nums[start + (end - start) / 2]) {
            return searchByIndexes(nums, target, start + (end - start) / 2, end);
        } else
            return searchByIndexes(nums, target, start, end - (end - start) / 2);
    }

    public static int searchIterative(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == target) return mid;

            else if(target > nums[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
