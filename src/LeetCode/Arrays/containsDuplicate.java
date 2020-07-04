package LeetCode.Arrays;

import java.util.*;

/**
 * @author humingjiang 2020-07-04 17:48
 **/
public class containsDuplicate {

    public static void main(String[] args) {
        containsNearbyDuplicate(new int[]{1,0,1,1},1);
    }
    /**
     * 存在重复的元素
     * @param nums
     * @return
     */
    public static boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length < 1) {
            return false;
        }
        Set<Integer> temp = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            boolean flag = temp.add(nums[i]);
            if (!flag) {
                return true;
            }
        }
        return false;
     }

    /**
     * 存在重复的元素II
     * @param nums
     * @param k
     * @return
     */
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        return false;
    }
}