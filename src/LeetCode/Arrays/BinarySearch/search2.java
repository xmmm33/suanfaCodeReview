package LeetCode.Arrays.BinarySearch;

public class search2 {


    public static void main(String[] args) {
        System.out.println(search(new int[]{1,3},3));
    }

    /**
     * 搜索旋转矩阵II
     * 不同点在于数组中有重复的元素
     * 思路：
     *      还是使用二分法，但多一个去重的步骤
     * @param nums
     * @param target
     * @return
     */
    public static boolean search(int[] nums, int target) {
        if (nums == null || nums.length < 1) {
            return false;
        }
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            // 这两个while循环就是在去重
            while (low < nums.length -1 && nums[low] == nums[low + 1]) {
                low++;
            }
            while (high > 0 && nums[high] == nums[high-1]) {
                high--;
            }
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] < nums[high]) {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                }else {
                    high = mid - 1;
                }
            }else {
                if (nums[mid] > target && target >= nums[low]) {
                    high = mid - 1;
                }else {
                    low = mid + 1;
                }
            }
        }
        return false;
    }
}
