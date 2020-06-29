package LeetCode.DFS;

public class exist {


    /**
     * 单词搜索
     * board =
     * [
     *   ['A','B','C','E'],
     *   ['S','F','C','S'],
     *   ['A','D','E','E']
     * ]
     * 给定 word = "ABCCED", 返回 true
     * 给定 word = "SEE", 返回 true
     * 给定 word = "ABCB", 返回 false
     * @param board
     * @param word
     * @return
     */
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
    // 用于剪枝
    private Boolean exist = false;

    private boolean dfs(char[][] board, int i, int j, String word, int cur) {
        if (cur == word.length()) {
            exist = true;
            return true;
        }
        // 深度遍历出口
        if (i < 0 || j < 0 || i >= board.length ||  j >= board[0].length || board[i][j] != word.charAt(cur)) {
            return false;
        }
        // 这里就是在剪枝
        if (!exist) {
            char temp = board[i][j];
            board[i][j] = '.';
            boolean ret1 = dfs(board, i + 1, j, word, cur + 1);
            boolean ret2 = dfs(board, i, j + 1, word, cur + 1);
            boolean ret3 = dfs(board, i, j -1, word, cur + 1);
            boolean ret4 = dfs(board, i-1, j, word, cur + 1);
            // 回溯
            board[i][j] = temp;
            return ret1 || ret2 || ret3 || ret4;
        }else {
            return true;
        }
    }
}
