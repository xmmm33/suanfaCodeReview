package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class spiralOrder {


    public static void main(String[] args) {
        spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}});
    }
    /**
     * 螺旋矩阵
     * @param matrix
     * @return
     */
    public static List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1) {
            return new ArrayList<>();
        }
        List<Integer> ret = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int high = 0, low = matrix.length-1, left = 0, right = matrix[0].length-1;
        int cnt = 0;
        while (cnt < m * n) {
            for (int i = left; i <= right; i++) {
                ret.add(matrix[high][i]);
                cnt++;
                if (cnt >= m * n) {
                    return ret;
                }
            }
            high++;
            for (int i = high; i <= low; i++) {
                ret.add(matrix[i][right]);
                cnt++;
                if (cnt >= m * n) {
                    return ret;
                }
            }
            right--;
            for (int i = right; i >= left; i--) {
                ret.add(matrix[low][i]);
                cnt++;
                if (cnt >= m * n) {
                    return ret;
                }
            }
            low--;
            for (int i = low; i >= high; i--) {
                ret.add(matrix[i][left]);
                cnt++;
                if (cnt >= m * n) {
                    return ret;
                }
            }
            left++;
        }
        return ret;
    }
}
