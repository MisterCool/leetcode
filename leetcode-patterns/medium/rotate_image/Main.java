package rotate_image;

import java.util.Arrays;

// https://leetcode.com/problems/rotate-image/description/
public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 9},
            {0, 4, 5, 1},
            {3, 1, 2, 4}};

        Solution.rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
