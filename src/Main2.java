import java.util.*;

public class Main2 {


    public boolean exist(char[][] board, String word) {
        if (board == null || board.length < 1 || board[0].length < 1) {
            return false;
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean exist = false;
    private boolean dfs(char[][] board, int i, int j, String word, int cur) {
        if (cur == word.length()) {
            exist = true;
            return true;
        }
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || word.charAt(cur) != board[i][j]) {
            return false;
        }
        if (!exist) {
            boolean flag1 = dfs(board, i + 1, j, word, cur + 1);
            boolean flag2 = dfs(board, i - 1, j, word, cur + 1);
            boolean flag3 = dfs(board, i, j + 1, word, cur + 1);
            boolean flag4 = dfs(board, i, j - 1, word, cur + 1);
            return flag1 || flag2 || flag3 || flag4;
        }
        return true;
    }

}
