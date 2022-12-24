package set_matrix_zeroes;

import java.util.Arrays;

// https://leetcode.com/problems/set-matrix-zeroes/
public class Main {
    public static void main(String[] args) {

        int[][] matrix = new int[][]{{1, 1, 2, 0}, {3, 0, 5, 2}, {1, 3, 1, 5}};
        Solution.setZeroesOptimal(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
