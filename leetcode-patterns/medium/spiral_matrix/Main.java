package spiral_matrix;


// https://leetcode.com/problems/spiral-matrix/description/
public class Main {

    public static void main(String[] args) {

        int[][] matrix = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}};

        System.out.println(new Solution().spiralOrder(matrix));
    }
    }
