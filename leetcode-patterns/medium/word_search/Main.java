package word_search;

// https://leetcode.com/problems/word-search/description/
public class Main {
    public static void main(String[] args) {

        char[][] board = new char[][]{
            {'C', 'A', 'A'},
            {'A', 'A', 'A'},
            {'B', 'C', 'D'}};

        System.out.println(Solution.exist(board, "AAB"));
    }
}
