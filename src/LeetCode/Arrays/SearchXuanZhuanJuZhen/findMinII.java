package LeetCode.Arrays.SearchXuanZhuanJuZhen;

/**
 * @author humingjiang 2020-07-04 15:46
 **/
public class findMinII {

    /**
     * 寻找旋转数组中的最小值，注意数组中有重复的元素
     * @param nums
     * @return
     */
    public int findMin(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[high] > nums[mid]) {
                high = mid;
            }else if (nums[high] < nums[mid]){
                low = mid + 1;
            }else{
                high--;
            }
        }
        return nums[low];
    }
}