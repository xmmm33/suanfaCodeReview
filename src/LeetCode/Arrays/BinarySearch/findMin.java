package LeetCode.Arrays.BinarySearch;

/**
 * @author humingjiang 2020-07-04 15:41
 **/
public class findMin {

    /**
     * 寻找旋转数组中的最小值
     * @param nums
     * @return
     */
    public int findMin(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] > nums[i + 1]) {
                return nums[i + 1];
            }
        }
        return nums[0];
    }
}