package spiral_matrix;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/spiral-matrix/solutions/1530816/java-code-with-comments-easy-to-understand/
public class Solution {

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int left = 0;
        int top = 1;
        int bottom = matrix.length - 1;
        int right = matrix[0].length - 1;
        int itemCount = matrix.length * matrix[0].length;
        int items = 0;

        while (items < itemCount) {

            for (int i = left; i <= right && items < itemCount; i++) {
                result.add(matrix[left][i]);
                items++;
            }

            for (int i = top; i <= bottom && items < itemCount; i++) {
                result.add(matrix[i][right]);
                items++;
            }


            for (int i = right - 1; i >= left && items < itemCount; i--) {
                result.add(matrix[bottom][i]);
                items++;
            }

            for (int i = bottom - 1; i >= top && items < itemCount; i--) {
                result.add(matrix[i][left]);
                items++;
            }


            left++;
            right--;
            bottom--;
            top++;
        }

        return result;
    }
}
