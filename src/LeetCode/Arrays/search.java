package LeetCode.Arrays;

public class search {

    /**
     * 搜索旋转数组
     * 变异二分查找，利用数组头和尾的元素来确定左右子数组是否有序，然后在确定left和right指针的走向
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        if (nums == null || nums.length < 1) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < nums[right]) {
                // 这就说明右半边数组是有序的,进而继续判断target在右半边还是左半边数组
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }
            }else {
                // 这就说明左半边数组是有序的，进而继续判断target在右半边还是左半边数组
                if (nums[mid] > target && target >= nums[left]) {
                    // target所在的范围 [num[left] , nums[mid])
                    right = mid-1;
                }else {
                    left = mid+1;
                }
            }
        }
        return -1;
    }
}
