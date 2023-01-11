package missing_number;


// sum of an arithmetic progression = n*(n+1)/2
public class Solution {

    public static int missingNumber(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        int totalSum = nums.length * (nums.length + 1) / 2;

        return totalSum -  sum;
    }
}
