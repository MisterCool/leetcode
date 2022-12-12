package majority_element;

// https://leetcode.com/problems/majority-element/
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 1, 1, 1, 2, 2};

        System.out.println(Solution.majorityElementOptimal(nums));
    }
}
