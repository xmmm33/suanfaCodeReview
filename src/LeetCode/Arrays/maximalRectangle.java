package LeetCode.Arrays;

public class maximalRectangle {

    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int[] heights = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    heights[j] = heights[j] + 1;
                }else {
                    heights[j] = 0;
                }
            }
            max = Math.max(max, countMax(heights));
        }
        return max;
    }

    private int countMax(int[] heights) {
        if (heights == null || heights.length < 1) {
            return 0;
        }
        int ret = Integer.MIN_VALUE;
        for (int i = 0; i < heights.length; i++) {
            int minhight = heights[i];
            for (int j = i; j < heights.length; j++) {
                minhight = Math.min(minhight, heights[j]);
                int tempmax = minhight * (j - i + 1);
                ret = Math.max(ret, tempmax);
            }
        }
        return ret;
    }

}
