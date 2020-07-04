package LeetCode.Arrays;

import java.util.Arrays;

/**
 * @author humingjiang 2020-07-04 16:17
 **/
public class rotate {

    /**
     * 不使用辅助空间完成旋转数组生成
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k) {
        if (nums == null || nums.length < 1) {
            return;
        }
        k = k % nums.length;
        for (int i = 0; i < k; i++) {
            int temp = nums[nums.length-1];
            for (int j = nums.length - 1; j > 0; j++) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }
    }

    public static void main(String[] args) {
        rotate(new int[]{1, 2, 3, 4, 5, 6, 7},3);
    }
}