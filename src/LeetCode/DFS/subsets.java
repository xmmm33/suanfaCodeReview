package LeetCode.DFS;

import java.util.ArrayList;
import java.util.List;

public class subsets {

    public static void main(String[] args) {
        subsets(new int[]{1, 2, 3});
    }

    /**
     * 子集
     *
     * @param nums
     * @return
     */
    private static List<List<Integer>> ret = new ArrayList<>();

    public static List<List<Integer>> subsets(int[] nums) {
        if (nums == null || nums.length < 1) {
            return new ArrayList<>();
        }
        dfs(nums, 0, new ArrayList<Integer>());
        return ret;
    }

    private static void dfs(int[] nums, int pos, ArrayList<Integer> integers) {
        if (pos > nums.length) {
            return;
        }
        ret.add(new ArrayList<>(integers));
        for (int i = pos; i < nums.length; i++) {
            integers.add(nums[i]);
            dfs(nums, i + 1, integers);
            integers.remove(integers.size() - 1);
        }
        return;
    }
}
