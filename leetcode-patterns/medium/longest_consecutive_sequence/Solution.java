package longest_consecutive_sequence;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/longest-consecutive-sequence/solutions/1294511/java-explanation-in-simple-english-o-n-hashset/

// main idea is count numbers before number and after this number and do remove then complexity will be O(n)
public class Solution {

    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxLengthSeq = 0;

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for (Integer i : nums) {
            if(!set.contains(i)) continue;
            int countBot = 0;
            int countTop = 0;
            set.remove(i);
            if (set.contains(i - 1)) {
                int bot = i - 1;
                while (set.contains(bot)) {
                    set.remove(bot);
                    countBot++;
                    bot--;
                }
            } if (set.contains(i + 1)) {
                int top = i + 1;
                while (set.contains(top)) {
                    set.remove(top);
                    countTop++;
                    top++;
                }
            }

            maxLengthSeq = Math.max(maxLengthSeq, countBot + 1 + countTop);
        }

        return maxLengthSeq;
    }

}
