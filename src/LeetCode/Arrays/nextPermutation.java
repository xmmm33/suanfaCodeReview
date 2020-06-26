package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class nextPermutation {

    /**
     * 复习全排列
     *
     * @param nums
     */
    private static List<List<Integer>> ret = new ArrayList<>();
    public static void allPermutation(int[] nums) {
        if (nums == null || nums.length < 1) {
            return;
        }
        boolean[] vis = new boolean[nums.length];
        dfss(nums, new ArrayList<Integer>(), vis);
        System.out.println("");
    }

    private static void dfss(int[] nums, ArrayList<Integer> next, boolean[] vis) {
        if (next.size() == 3) {
            ret.add(new ArrayList<>(next));
        }
        for (int i = 0; i < nums.length; i++) {
            if (vis[i]) {
                continue;
            }
            vis[i] = true;
            next.add(nums[i]);
            dfss(nums,next, vis);
            next.remove(next.size() - 1);
            vis[i] = false;
        }
    }

    public static void main(String[] args) {
//        allPermutation(new int[]{1, 2, 3});
        nextPermutation(new int[]{1, 2, 3});
    }

    /**
     * 下一个排列
     * 思路：从右往左遍历，找到第一组前面的数小于后面的数这样的一个组合 ，然后交换，然后
     * @param nums
     */
    public static void nextPermutation(int[] nums) {
        // 这里i指向前面的那个数
        // j指向后面的那个数
        // 我要找的是nums[i] < nums[j]的这样一对ij下标
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[i] < nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    // 最后把i后面的子数组进行升序
                    Arrays.sort(nums,i+1,nums.length);
                    return;
                }
            }
        }
        // 如果走到这里，说明原数组是一个降序数组 所以返回直接把数组升序就行
        Arrays.sort(nums);
    }
}
