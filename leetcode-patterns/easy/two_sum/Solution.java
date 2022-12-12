package two_sum;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexByValue = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            indexByValue.put(nums[i], i);
        }


        for (int i = 0; i < nums.length; i++) {
            if(indexByValue.containsKey(target - nums[i]) && indexByValue.get(target - nums[i]) != i){
                return new int[]{i,indexByValue.get(target - nums[i])};
            }
        }

        return new int[]{};
    }
}
