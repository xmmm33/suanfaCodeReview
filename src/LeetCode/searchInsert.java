package LeetCode;

public class searchInsert {

    /**
     * 搜索有序数组nums中的target的下表
     * 思路：二分查找
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length < 1) {
            return -1;
        }
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        if (target <= nums[0]) {
            return 0;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }else {
                return mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        searchInsert(new int[]{1, 3, 5, 6}, 7);
    }
}
