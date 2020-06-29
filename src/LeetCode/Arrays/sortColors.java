package LeetCode.Arrays;

public class sortColors {

    /**
     * 颜色分类，国旗问题，三色问题
     * 思路：
     *     三指针；i用来遍历数组，low总是指向左边，high总是指向右边，
     *     当i遇到2的时候，就与high指向的数组的元素进行交换
     *     当i遇到1的时候，就与low指向的数组的元素进行交换
     * @param nums
     */
    public void sortColors(int[] nums) {
        if (nums == null || nums.length < 1) {
            return;
        }
        int low = 0;
        int high = nums.length - 1;
        int i = 0;
        while (i <= high) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[low];
                nums[low] = temp;
                low++;
                i++;
            } else if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 2) {
                int temp = nums[i];
                nums[i] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}
