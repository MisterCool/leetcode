package permutations;

import static permutations.Solution.permute;

// https://leetcode.com/problems/permutations/description/
public class Main {
    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3};

        System.out.println(permute(nums));
    }
}
