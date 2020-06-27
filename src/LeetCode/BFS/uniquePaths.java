package LeetCode.BFS;

public class uniquePaths {


    public static void main(String[] args) {
        uniquePaths(23, 12);
    }
    /**
     * 不同路径
     * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
     * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
     * 问总共有多少条不同的路径？
     * @param m
     * @param n
     * @return
     */
    private static int res = 0;

    public static int uniquePaths(int m, int n) {
        int rowstart = 0;
        int colstart = 0;
        bfs(m, n, rowstart, colstart);
        return res;
    }

    private static void bfs(int m, int n, int rowstart, int colstart) {
        if (rowstart >= m || colstart >= n) {
            return;
        }
        if (rowstart == m - 1 && colstart == n - 1) {
            res++;
        }
        bfs(m,n,rowstart+1,colstart);
        bfs(m,n,rowstart,colstart+1);
        return;
    }
}
