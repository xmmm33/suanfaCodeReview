package LeetCode.Arrays;

import java.util.HashSet;
import java.util.Set;

public class setZeroes {

    /**
     * 矩阵置0
     * @param matrix
     */
    public void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1) {
            return;
        }
        Set<Integer> col = new HashSet<>();
        Set<Integer> row = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    col.add(j);
                    row.add(i);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (col.contains(j) || row.contains(i)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
