package LeetCode.DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsets2 {


    public static void main(String[] args) {
        subsetsWithDup(new int[]{1, 2, 2});
    }

    private static List<List<Integer>> ret = new ArrayList<>();
    /**
     * 子集II，数组中有重复的元素
     * @param nums
     * @return
     */
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        if (nums == null || nums.length < 1) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        dfs(nums, 0, new ArrayList<Integer>());
        return ret;
    }

    private static void dfs(int[] nums, int pos, ArrayList<Integer> integers) {
        if (pos > nums.length) {
            return;
        }
        ret.add(new ArrayList<>(integers));
        for (int i = pos; i < nums.length; i++) {
            if (i > pos && nums[i] == nums[i - 1]) {
                continue;
            }
            integers.add(nums[i]);
            dfs(nums, i+1, integers);
            integers.remove(integers.size() - 1);
        }
        return;
    }
}
