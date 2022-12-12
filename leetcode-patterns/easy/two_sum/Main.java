package two_sum;

import java.util.Arrays;

import static two_sum.Solution.twoSum;

// https://leetcode.com/problems/two-sum/
public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 4};

        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }
}
