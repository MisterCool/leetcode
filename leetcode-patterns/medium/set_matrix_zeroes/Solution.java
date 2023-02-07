package set_matrix_zeroes;

import java.util.Arrays;

public class Solution {

    // O(m + n)
    public static void setZeroes(int[][] matrix) {
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];


        Arrays.fill(row, 1);
        Arrays.fill(col, 1);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 0;
                    col[j] = 0;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrix[i][j] * row[i] * col[j];
            }
        }
    }

    // O(1)
    // I need to use space inside matrix namely 0 row and 0 col which will show how I have to set cell
    public static void setZeroesOptimal(int[][] matrix) {

        int colLength = matrix.length;
        int rowLength = matrix[0].length;

        boolean isFirstRow = false;
        boolean isFirstCol = false;

        for (int i = 0; i < rowLength; i++) {
            if (matrix[0][i] == 0) isFirstRow = true;
        }

        for (int i = 0; i < colLength; i++) {
            if (matrix[i][0] == 0) isFirstCol = true;
        }

        for (int i = 1; i < colLength; i++) {
            for (int j = 1; j < rowLength; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for (int i = 1; i < colLength; i++) {
            for (int j = 1; j < rowLength; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (isFirstRow) {
            for (int i = 0; i < rowLength; i++) matrix[0][i] = 0;
        }


        if (isFirstCol) {
            for (int i = 0; i < colLength; i++) matrix[i][0] = 0;
        }
    }
}
