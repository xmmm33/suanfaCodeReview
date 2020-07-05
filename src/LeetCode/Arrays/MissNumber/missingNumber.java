package LeetCode.Arrays.MissNumber;

import java.util.Arrays;

/**
 * @author humingjiang 2020-07-05 14:58
 **/
public class missingNumber {


    public static void main(String[] args) {
        missingNumber2(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1});
    }
    public int missingNumber(int[] nums) {
        if (nums == null || nums.length < 1) {
            return -1;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                return i;
            }
        }
        return nums.length;
    }

    /**
     * 异或的思想
     * 举个例子：
     * 0 ^ 4 = 4
     * 4 ^ 4 = 0
     * 那么，就可以不用求和，直接使用异或运算^进行 抵消，剩下的数字就是缺失的了。
     *
     * 再举个例子：
     * 1^1^2^2^3 = 3
     * @param nums
     * @return
     */
    public static int missingNumber2(int[] nums) {
        if (nums == null || nums.length < 1) {
            return -1;
        }
        // 为什么要ret初始化为num.length呢？因为如果前面的数子都是正确的，不管最后一位是什么数子，那么确实的数字总是数组长度
        int ret = nums.length;
        for (int i = 0; i < nums.length; i++) {
            ret = ret ^ nums[i];
            ret = ret ^ i;
        }
        return ret;
    }
}