package LeetCode.Arrays.LuoXuanJuZhen;

public class generateMatrix {


    public static void main(String[] args) {
        generateMatrix(3);
    }
    /**
     * 生成一个螺旋矩阵
     * @param n
     * @return
     */
    public static int[][] generateMatrix(int n) {
        int cnt = 1;
        int[][] ret = new int[n][n];
        int high = 0, low = n - 1, left = 0, right = n - 1;
        while (cnt <= n * n) {
            for (int i = left; i <= right; i++) {
                ret[high][i] = cnt;
                cnt++;
                if (cnt > n * n) {
                    return ret;
                }
            }
            high++;
            for (int i = high; i <= low ; i++) {
                ret[i][right] = cnt;
                cnt++;
                if (cnt > n * n) {
                    return ret;
                }
            }
            right--;
            for (int i = right; i >= left ; i--) {
                ret[low][i] = cnt;
                cnt++;
                if (cnt > n * n) {
                    return ret;
                }
            }
            low--;
            for (int i = low; i >=high ; i--) {
                ret[i][left] = cnt;
                cnt++;
                if (cnt > n * n) {
                    return ret;
                }
            }
            left++;
        }
        return ret;
    }
}
