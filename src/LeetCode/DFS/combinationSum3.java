package LeetCode.DFS;

import java.util.ArrayList;
import java.util.List;

/**
 * @author humingjiang 2020-07-04 17:35
 **/
public class combinationSum3 {

    public static void main(String[] args) {
        combinationSum3(3, 9);
        System.out.println();
    }

    private static List<List<Integer>> res = new ArrayList<>();
    /**
     * 组合总和III
     * @param k
     * @param n
     * @return
     */
    public static List<List<Integer>> combinationSum3(int k, int n) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        dfs(nums, k, n, new ArrayList<Integer>(),0,0);
        return res;
    }

    private static void dfs(int[] nums, int k, int n, ArrayList<Integer> integers, int sum, int index) {
        if (sum > n) {
            return;
        }
        if (sum == n && integers.size() == k) {
            res.add(new ArrayList<>(integers));
            return;
        }
        for (int i = index; i < nums.length; i++) {
            sum = sum + nums[i];
            integers.add(nums[i]);
            dfs(nums, k, n, integers, sum, i + 1);
            sum = sum - nums[i];
            integers.remove(integers.size() - 1);
        }
    }
}