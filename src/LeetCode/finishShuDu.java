package LeetCode;

/**
 * @author humingjiang 2020-07-30 17:50
 **/
public class finishShuDu {

    public void solveSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] box = new boolean[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    row[i][num] = true;
                    col[j][num] = true;
                    box[i / 3 * 3 + j / 3][num] = true;
                }
            }
        }
        dfs(board, row, col, box, 0, 0);
    }

    private boolean dfs(char[][] board, boolean[][] row, boolean[][] col, boolean[][] box, int i, int j) {
        // 找空当
        while (board[i][j] != '.') {
            if (++j >= 9) {
                i++;
                j = 0;
            }
            if (i >= 9) {
                return true;
            }
        }
        // dfs
        for (int num = 0; num < 9; num++) {
            int boxindex = i * 3 / 3 + j / 3;
            if (!row[i][num] && !col[j][num] && !box[boxindex][num]) {
                board[i][j] = (char) ('1' + num);
                row[i][num] = true;
                col[j][num] = true;
                box[boxindex][num] = true;
                if (dfs(board, row, col, box, i, j)) {
                    return true;
                }else {
                    // 回溯
                    board[i][j] = '.';
                    row[i][num] = false;
                    col[j][num] = false;
                    box[boxindex][num] = false;
                }
            }
        }
        return false;
    }
}