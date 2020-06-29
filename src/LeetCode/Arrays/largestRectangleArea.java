package LeetCode.Arrays;

public class largestRectangleArea {


    public static void main(String[] args) {
        largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3});
    }
    /**
     * 最大矩形 https://leetcode-cn.com/problems/largest-rectangle-in-histogram/
     * @param heights
     * @return
     */
    public static int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length < 1) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < heights.length; i++) {
            int minhigh = heights[i];
            for (int j = i; j < heights.length; j++) {
                minhigh = Math.min(minhigh, heights[j]);
                int tempmax = minhigh * (j - i + 1);
                max = Math.max(tempmax, max);
            }
        }
        return max;
    }
}
