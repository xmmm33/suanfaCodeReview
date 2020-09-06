
import java.util.*;

public class class2{

    public static class Fl{
        private int[][] dist;
        private int[][] path;
        private List<Integer> result = new ArrayList<>();

        public Fl(int size) {
            dist = new int[size][size];
            path = new int[size][size];
        }

        public void findPath(int i, int j) {
            int k = path[i][j];
            if (k == 1) {
                return;
            }
            findPath(i, k);
            result.add(k);
            findPath(k, j);
        }

        public void findMinPath(int begin, int end, int[][] juzhen) {
            floyd(juzhen);
            result.add(begin);
            findPath(begin, end);
            result.add(end);
        }

        public void floyd(int[][] juzhen) {
            int size = juzhen.length;
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    path[i][j] = -1;
                    dist[i][j] = juzhen[i][j];
                }
            }
            for (int k = 0; k < size; k++) {
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        if (dist[k][j] != Integer.MAX_VALUE && dist[i][k] + dist[k][j] < dist[i][j]) {
                            dist[i][j] = dist[i][k] + dist[k][j];
                            path[i][j] = k;
                        }
                    }
                }
            }
        }
    }
    /**
     * 1
     * 2 1 2
     * 3 4 2 1 3
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();
        Fl fl = new Fl(n);
        // 初始化矩阵
        int[][] martx = new int[n][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 3; j++) {
                int begin = sc.nextInt();
                int end = sc.nextInt();
                martx[begin][end] = sc.nextInt();
                martx[end][begin] = martx[begin][end];
            }
        }
        for (int i = 0; i < q; i++) {
            fl.findMinPath(sc.nextInt(), sc.nextInt(), martx);
        }
        for (Integer num : fl.result) {
            System.out.println(num);
        }
    }
}
