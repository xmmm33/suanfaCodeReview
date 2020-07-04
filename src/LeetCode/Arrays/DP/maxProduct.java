package LeetCode.Arrays.DP;

/**
 * @author humingjiang 2020-07-04 14:34
 **/
public class maxProduct {

    public static void main(String[] args) {
        maxProduct(new int[]{2, 3, -2, 4});
    }
    /**
     * 乘积最大的连续子数组
     * @param nums
     * @return
     */
    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        // 一个记录最大值，一个记录最小值；因为遇到负数，会让最小的变为最大值
        int imax = 1;
        int imin = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = imax;
                imax = imin;
                imin = temp;
            }
            imax = Math.max(imax * nums[i], nums[i]);
            imin = Math.min(imin * nums[i], nums[i]);
            max = Math.max(imax, max);
        }
        return max;
    }

    /**
     * 最大连续子数组的和
     * @param nums
     * @return
     */
    public static int maxProductSum(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            max = Math.max(dp[i], max);
        }
        return max;
    }
}