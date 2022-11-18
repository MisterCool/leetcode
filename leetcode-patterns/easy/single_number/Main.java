package single_number;

import static single_number.Solution.singleNumber;

// https://leetcode.com/problems/single-number/

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{5, 2, 5};

        System.out.println(singleNumber(nums));
    }
}
