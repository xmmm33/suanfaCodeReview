package LeetCode.Arrays.SlideWindow;

/**
 * @author humingjiang 2020-07-04 16:34
 **/
public class minSubArrayLen {

    public static void main(String[] args) {
        minSubArrayLen(11, new int[]{1, 2, 3, 4, 5});
    }
    /**
     * 长度最小的子数组
     * 滑动窗口
     * @param s
     * @param nums
     * @return
     */
    public static int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int low = 0;
        int high = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while (high < nums.length) {
            sum = sum + nums[high++];
            while (sum >= s) {
                min = Math.min(min, high - low);
                sum = sum - nums[low++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}