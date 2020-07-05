package LeetCode.Arrays.MissNumber;

import java.util.Arrays;

public class firstMissingPositive {

    /**
     * 缺失的第一个最小正整数，数组未排序，要求时间复杂度On，空间复杂度O1
     * 思路：
     *      两次遍历:
     *              第一次遍历：把数组中的值，放到对应下标位置上去
     *              第二次遍历：判断当前数组的值和下标是否对应，如果不对应，就返回下标；意思就是当下标为0的时候，这个位置的元素应该是1
     *                                                                                  下标为1的时候，这个位置的元素应该是2
     * @param nums
     * @return
     */
    public static int firstMissingPositive(int[] nums) {
        if (nums == null || nums.length < 1) {
            return -1;
        }
        // 把元素放到对应的位置上去
        for (int i = 0; i < nums.length; i++) {
            // 当下标和数值对应的时候，就直接进入下次循环
            if (i + 1 == nums[i]) {
                continue;
            }
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
                i--;
            }
        }
        // 判断下标与之数值是否对应
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return nums.length+1;
    }

    public static void main(String[] args) {
        firstMissingPositive(new int[]{3, 4, -1, 1});
    }
}
