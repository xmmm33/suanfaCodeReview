package JianZhiOffer;

/**
 * @author humingjiang 2020-07-19 16:28
 **/
public class exchange {

    /**
     * 调整数组顺序使奇数位于偶数前面
     * @param nums
     * @return
     */
    public int[] exchange(int[] nums) {
        if (nums.length < 1) {
            return new int[0];
        }
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            if (nums[low] % 2 == 1) {
                low++;
            }else {
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
        return nums;
    }
}