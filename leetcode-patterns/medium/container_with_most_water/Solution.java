package container_with_most_water;

public class Solution {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while(left < right) {
            maxArea = Math.max(maxArea, (right - left) * Math.min(height[right], height[left]));
            if(height[left] < height[right]){
                left++;
            } else right--;
        }

        return maxArea;
    }
}
