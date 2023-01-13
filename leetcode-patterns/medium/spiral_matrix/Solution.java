package spiral_matrix;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/spiral-matrix/solutions/1530816/java-code-with-comments-easy-to-understand/
public class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        dfs(0, 0, matrix, visited, result, false);

        return result;
    }

    private void dfs(int i, int j, int[][] matrix, boolean[][] visited, List<Integer> result, boolean isGoingUp) {
        if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || visited[i][j]) return;

        visited[i][j] = true;
        result.add(matrix[i][j]);
        if (isGoingUp) { //  if we don't have this extra going up check, it's gonna go to right first instead of keep going up
            dfs(i - 1, j, matrix, visited, result, true);
        }

        dfs(i, j + 1, matrix, visited, result, false); // right
        dfs(i + 1, j, matrix, visited, result, false); // down
        dfs(i, j - 1, matrix, visited, result, false); // left
        dfs(i - 1, j, matrix, visited, result, true); // up
    }
}
