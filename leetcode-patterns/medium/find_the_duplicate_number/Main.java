package find_the_duplicate_number;

import static find_the_duplicate_number.Solution.findDuplicateWithoutSpace;
// https://leetcode.com/problems/find-the-duplicate-number/ and watch on leetcode problem 142
public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 4, 2, 2};

        System.out.println(findDuplicateWithoutSpace(nums));
    }
}
