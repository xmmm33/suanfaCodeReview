package JianZhiOffer;

/**
 * @author humingjiang 2020-07-19 11:40
 **/
public class exist {

    /**
     * 判断一个矩阵中是否存在一个字符串的路径
     * @param board
     * @param word
     * @return
     */
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length < 1) {
            return false;
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, word, i, j,0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean flag = false;

    private boolean dfs(char[][] board, String word, int i, int j, int cur) {
        if (cur == word.length()) {
            flag = true;
            return true;
        }
        if (i >= board.length || j >= board[0].length || i < 0 || j < 0 || board[i][j] != word.charAt(cur)) {
            return false;
        }
        if (!flag) {
            char c = board[i][j];
            board[i][j] = '.';
            boolean ret1 = dfs(board, word, i + 1, j, cur + 1);
            boolean ret2 = dfs(board, word, i, j + 1, cur + 1);
            boolean ret3 = dfs(board, word, i, j - 1, cur + 1);
            boolean ret4 = dfs(board, word, i - 1, j, cur + 1);
            board[i][j] = c;
            return ret1 || ret2 || ret3 || ret4;
        }else {
            return true;
        }
    }

    public boolean exist2(char[][] board, String word) {
        if (board == null || board.length < 1 || board[0].length < 1) {
            return false;
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs2(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean flag2 = false;
    private boolean dfs2(char[][] board, String word, int i, int j, int cur) {
        if (cur == word.length()) {
            flag2 = true;
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(i)) {
            return false;
        }
        if (!flag2) {
            char c = board[i][j];
            board[i][j] = '.';
            boolean ret1 = dfs2(board, word, i + 1, j, cur + 1);
            boolean ret2 = dfs2(board, word, i - 1, j, cur + 1);
            boolean ret3 = dfs2(board, word, i, j + 1, cur + 1);
            boolean ret4 = dfs2(board, word, i, j - 1, cur + 1);
            board[i][j] = c;
            return ret1 || ret2 || ret3 || ret4;
        }
        return true;
    }
}