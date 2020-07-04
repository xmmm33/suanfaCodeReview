package LeetCode.Arrays;

import java.util.Arrays;

/**
 * @author humingjiang 2020-07-04 14:27
 **/
public class longestConsecutive {

    public static void main(String[] args) {
        longestConsecutive(new int[]{100, 4, 200, 1, 3, 2});
    }

    /**
     * 最长连续子序列
     * 输入: [100, 4, 200, 1, 3, 2]
     * 输出: 4
     * 解释: 最长连续序列是 [1, 2, 3, 4]。它的长度为 4。
     * @param nums
     * @return
     */
    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        Arrays.sort(nums);
        int ret = 0;
        int temp = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                i++;
                continue;
            }
            if (nums[i] - nums[i - 1] == 1) {
                temp++;
            }else {
                ret = Math.max(ret, temp);
                temp = 1;
            }
        }
        ret = Math.max(ret, temp);
        return ret;
    }
}