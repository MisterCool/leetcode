package find_all_numbers_disappeared_in_an_array;

import static find_all_numbers_disappeared_in_an_array.Solution.findDisappearedNumbers;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};

        System.out.println(findDisappearedNumbers(nums));
    }
}
