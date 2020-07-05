package LeetCode.Arrays;

/**
 * @author humingjiang 2020-07-05 14:46
 **/
public class productExceptSelf {

    public static void main(String[] args) {
        productExceptSelf(new int[]{1, 2, 3, 4});
    }
    /**
     * 求自身数组以外的乘积
     * 输入: [1,2,3,4]
     * 输出: [24,12,8,6]
     *
     * 暴力
     * @param nums
     * @return
     */
    public static int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length < 1) {
            return new int[0];
        }
        int[] ret = new int[nums.length];
        int i = 0;
        while (i < nums.length) {
            int left = i-1;
            int right = i + 1;
            int temp = 1;
            while (left >= 0) {
                temp = temp * nums[left--];
            }
            while (right < nums.length) {
                temp = temp * nums[right++];
            }
            ret[i++] = temp;
        }
        return ret;
    }

    public static int[] productExceptSelf2(int[] nums) {
        if (nums == null || nums.length < 1) {
            return new int[0];
        }
        int[] ret = new int[nums.length];
        int k = 1;
        // 左乘
        for (int i = 0; i < nums.length; i++) {
            ret[i] = k * nums[i];
            k = k * nums[i];
        }
        // 右乘
        k = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            ret[i] = k * nums[i];
            k = k * nums[i];
        }
        return ret;
    }
}