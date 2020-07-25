package JianZhiOffer;

/**
 * @author humingjiang 2020-07-25 16:09
 **/
public class search {

    /**
     * 在排序数组中搜索数字
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > target) {
                high = mid;
            } else if (nums[mid] < target) {
                low = mid;
            }else {
                int ret = 1;
                int k = mid;
                while (k > 0 && nums[k] == nums[k - 1]) {
                    ret++;
                    k--;
                }
                k = mid;
                while (k < nums.length - 1 && nums[k] == nums[k + 1]) {
                    ret++;
                    k++;
                }
                return ret;
            }
        }
        return -1;
    }
}