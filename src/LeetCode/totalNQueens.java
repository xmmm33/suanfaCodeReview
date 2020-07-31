package LeetCode;

/**
 * @author humingjiang 2020-07-31 11:05
 **/
public class totalNQueens {

    private boolean[] col;

    private boolean[] left;

    private boolean[] right;

    private Integer ret;
    /**
     * 返回N皇后解决方案总数
     * @param n
     * @return
     */
    public int totalNQueens(int n) {
        col = new boolean[n];
        left = new boolean[2 * n - 1];
        right = new boolean[2 * n - 1];
        ret = 0;
        putQueen(n, 0);
        return ret;
    }

    private void putQueen(int totalRow, int curRow) {
        if (curRow == totalRow) {
            ret++;
            return;
        }
        for (int i = 0; i < totalRow; i++) {
            if (!col[i] && !left[curRow + i] && !right[curRow - i + totalRow - 1]) {
                col[i] = true;
                left[curRow + i] = true;
                right[curRow - i + totalRow - 1] = true;
                putQueen(totalRow, curRow + 1);
                col[i] = false;
                left[i + curRow] = false;
                right[curRow - i + totalRow - 1] = false;
            }
        }
        return;
    }
}