package LeetCode.Arrays;

import java.util.Arrays;

public class threeSumClosest {

    /**
     * 最接近的三数之和
     * 输入：nums = [-1,2,1,-4], target = 1
     * 输出：2
     * 解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
     * 三指针法~~
     */
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int start = 0;
        int res = 0;
        int mincha = Integer.MAX_VALUE;
        while (start < nums.length) {
            int left = start + 1;
            int right = nums.length - 1;
            while (left < right) {
                int temp = nums[start] + nums[left] + nums[right];
                int cha = Math.abs(target - temp);
                if (cha < mincha) {
                    res = temp;
                    mincha = cha;
                }
                if (target - temp > 0) {
                    left++;
                }else if (target - temp < 0){
                    right--;
                }else {
                    return temp;
                }
            }
            start++;
        }
        return res;
    }

    public static void main(String[] args) {
        threeSumClosest(new int[]{1,2,4,8,16,32,64,128}, 82);
    }
}
