package three_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();

        for(int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while(left < right) {
                List<Integer> list = new ArrayList<>();
                int sum = nums[left] + nums[right] + nums[i];
                if(sum == 0) {
                    list.add(nums[left]);
                    list.add(nums[right]);
                    list.add(nums[i]);
                    right--;
                    left++;
                } else if(sum > 0) right--;
                else left++;
                if(!list.isEmpty()) set.add(list);
            }
        }
        return new ArrayList<>(set);
    }
}
