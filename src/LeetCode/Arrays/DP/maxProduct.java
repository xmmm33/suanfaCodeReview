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
        int max = nums[0];
        // 一个记录最大值，一个记录最小值；因为遇到负数，会让最小的变为最大值
        int[] maxdp = new int[nums.length];
        maxdp[0] = nums[0];
        int[] mindp = new int[nums.length];
        mindp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = maxdp[i - 1];
                maxdp[i - 1] = mindp[i - 1];
                mindp[i - 1] = temp;
            }
            maxdp[i] = Math.max(maxdp[i-1] * nums[i], nums[i]);
            mindp[i] = Math.min(mindp[i-1] * nums[i], nums[i]);
            max = Math.max(maxdp[i], max);
        }
        return max;
    }

    /**
     * 最大连续子数组的和
     * 这道题和上面那道题的不一样的地方就在于，上面那道题需要记录最小值，因为最小值遇到负数就可以成为最大值
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