package LeetCode.Arrays.BinarySearch;

import java.util.*;

public class threeSum {

    /**
     * 找出所有三数之和为0的子序列
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 1) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        if (nums[0] > 0) {
            return new ArrayList<>();
        }
        Set<List<Integer>> ret = new HashSet<>();
        int start = 0;
        while (start < nums.length) {
            int left = start + 1;
            int right = nums.length - 1;
            while (left < nums.length && left < right) {
                int tempsum = nums[start] + nums[left] + nums[right];
                if (tempsum == 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[start]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    ret.add(temp);
                    right--;
                    left++;
                } else if (tempsum > 0) {
                    right--;
                }else {
                    left++;
                }
            }
            start++;
        }
        List<List<Integer>> res = new ArrayList<>();
        res.addAll(ret);
        return res;
    }

    public static void main(String[] args) {
        threeSum(new int[]{-1, 0, 1, 2, -1, -4});
    }
}
