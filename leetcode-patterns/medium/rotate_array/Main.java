package rotate_array;

import java.util.Arrays;

// https://leetcode.com/problems/rotate-array/description/
public class Main {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4};
        new Solution().rotate(ints, 5);
        System.out.println(Arrays.toString(ints));
    }
}
