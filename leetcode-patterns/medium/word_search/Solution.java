package word_search;

// use recursion to go through neighbors
public class Solution {

    private static boolean[][] visited;

    public static boolean exist(char[][] board, String word) {
        int wordIndex = 0;

        visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == word.toCharArray()[wordIndex]) {
                    if (searchWord(i, j, word, wordIndex, board)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }


    public static boolean searchWord(int i, int j, String word, int wordIndex, char[][] board) {

        if (wordIndex == word.length()) {
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] || board[i][j] != word.charAt(wordIndex))
            return false;

        visited[i][j] = true;
        if (searchWord(i + 1, j, word, wordIndex + 1, board)
            || searchWord(i - 1, j, word, wordIndex + 1, board)
            || searchWord(i, j + 1, word, wordIndex + 1, board)
            || searchWord(i, j - 1, word, wordIndex + 1, board)
        ) return true;

        visited[i][j] = false;
        return false;
    }
}
