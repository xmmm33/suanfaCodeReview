package LeetCode.Arrays.SearchXuanZhuanJuZhen;

/**
 * @author humingjiang 2020-07-04 15:51
 **/
public class findPeakElement {

    /**
     * 寻找峰值
     * 这个数比左右两边的数都大
     * 还是二分
     * 规律一：如果nums[i] > nums[i+1]，则在i之前一定存在峰值元素
     *
     * 规律二：如果nums[i] < nums[i+1]，则在i+1之后一定存在峰值元素
     * @param nums
     * @return
     */
    public int findPeakElement(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] > nums[mid + 1]) {
                high = mid;
            }else {
                low = mid + 1;
            }
        }
        return low;
    }
}