package JianZhiOffer;

/**
 * @author humingjiang 2020-07-19 11:52
 **/
public class movingCount {

    /**
     * 机器人的运动范围
     * @param m
     * @param n
     * @param k
     * @return
     */
    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        return dfs(0, 0, m, n, k, visited);
    }

    private int dfs(int i, int j, int m, int n, int k, boolean[][] visited) {
        if (i >= m || j >= n || i < 0 || j < 0 || sumtow(i, j) > k || visited[i][j]) {
            return 0;
        }
        visited[i][j] = true;
        return 1 + dfs(i + 1, j, m, n, k, visited) + dfs(i, j + 1, m, n, k, visited)
                + dfs(i - 1, j, m, m, k, visited) + dfs(i, j - 1, m, n, k, visited);
    }


    public int sumtow(int a, int b) {
        int ret = 0;
        while (a > 0) {
            ret = ret + a % 10;
            a = a / 10;
        }
        while (b > 0) {
            ret = ret + b % 10;
            b = b / 10;
        }
        return ret;
    }
}