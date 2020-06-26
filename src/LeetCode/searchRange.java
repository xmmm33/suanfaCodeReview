package LeetCode;

import java.util.Arrays;

public class searchRange {

    /**
     * 在升序数组中查找target第一次和第二次出现的下标
     * 思路：二分查找的变异
     * @param nums
     * @param target
     * @return
     */
    public static int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        if (nums == null || nums.length < 1) {
            return new int[]{-1,-1};
        }
        int left = 0 ;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid-1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }else {
                res[0] = mid;
                res[1] = mid;
                while (mid > 0 && nums[mid - 1] == target) {
                    mid--;
                }
                res[0] = mid;
                while (mid < nums.length - 1 && nums[mid + 1] == target) {
                    mid++;
                }
                res[1] = mid;
                return res;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        searchRange(new int[]{1,2,3,3,3,3,4,5,9}, 3);
    }
}
