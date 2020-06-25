package LeetCode;

import org.omg.CORBA.MARSHAL;

public class maxArea {

    /**
     * 盛水最多
     * 思路：暴力遍历
     * @param height
     * @return
     */
    public static int maxArea(int[] height) {
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                res = Math.max(res, Math.min(height[i], height[j]) * (j - i));
            }
        }
        return res;
    }

    /**
     * 盛水最多
     * 思路：双指针; 向内移动短板，可以得到最大收益值
     * 依据：
     *      若向内移动短板，水槽的短板 min(h[i], h[j])可能变大，因此水槽面积S(i,j)可能增大。
     *      若向内移动长板，水槽的短板 min(h[i], h[j])不变或变小，下个水槽的面积一定小于当前水槽面积。
     * @param height
     * @return
     */
    public static int maxArea2(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int res = Integer.MIN_VALUE;
        while (left < right) {
            // 向内移动短板可以得到最大收益值
            res = height[left] < height[right] ? Math.max(res, height[left++] * (right - left)) : Math.max(res, height[right--] * (right - left));
        }
        return res;
    }

    public static void main(String[] args) {
        maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
    }
}
