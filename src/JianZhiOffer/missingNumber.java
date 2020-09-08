package JianZhiOffer;

/**
 * @author humingjiang 2020-07-25 16:37
 **/
public class missingNumber {

    /**
     * 排序数组中缺失的数字
     *
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == mid) {
                //如果相等，说明前面没有缺失，要往后面找
                low = mid + 1;
            } else {
                //如果不相等，说明缺失的在前面，要往前面找
                high = mid - 1;
            }
        }
        return low;
    }

    public int missingNumber2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == mid) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return low;
    }
}