package number_of_islands;

public class Main {
    public static void main(String[] args) {
        char[][] grid = new char[][]{{'1', '1', '1'}, {'0', '1', '0'}, {'1', '1', '1'}};

        System.out.println(new Solution().numIslands(grid));

    }
}
