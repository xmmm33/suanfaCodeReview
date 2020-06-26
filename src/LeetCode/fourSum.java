package LeetCode;

import java.util.*;

public class fourSum {


    /**
     * 四数之和
     * @param nums
     * @param target
     * @return
     */
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums == null || nums.length < 1) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        Set<List<Integer>> fuzhi = new HashSet<>();
        int start = 0;
        while (start < nums.length) {
            int second = start + 1;
            while (second < nums.length) {
                int left = second + 1;
                int right = nums.length - 1;
                while (left < nums.length && left < right) {
                    int tempsum = nums[start] + nums[second] + nums[left] + nums[right];
                    if (tempsum > target) {
                        right--;
                    } else if (tempsum < target) {
                        left++;
                    }else {
                        List<Integer> tmep = new ArrayList<>();
                        tmep.add(nums[start]);
                        tmep.add(nums[second]);
                        tmep.add(nums[left]);
                        tmep.add(nums[right]);
                        fuzhi.add(tmep);
                        right--;
                        left++;
                    }
                }
                second++;
            }
            start++;
        }
        List<List<Integer>> res = new ArrayList<>();
        res.addAll(fuzhi);
        return res;
    }
}
