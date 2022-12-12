package majority_element;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    // space O(n)
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> elementByCount = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (elementByCount.containsKey(nums[i])) {
                elementByCount.put(nums[i], elementByCount.get(i) + 1);
            } else elementByCount.put(nums[i], 1);
        }

        return elementByCount.entrySet().stream().max(Comparator.comparingInt(t -> t.getValue())).get().getKey();
    }

    // optimal https://en.wikipedia.org/wiki/Boyer%E2%80%93Moore_majority_vote_algorithm
    public static int majorityElementOptimal(int[] nums) {
        int candidate = nums[0];
        int count = 1;
        for (int num : nums) {
            if (candidate == num) count++;
            else count--;

            if (count == 0) {
                count = 1;
                candidate = num;
            }
        }

        return candidate;
    }
}
