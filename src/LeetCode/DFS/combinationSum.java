package LeetCode.DFS;

import java.util.*;

public class combinationSum {

    private static List<List<Integer>> ret = new ArrayList<>();

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates == null || candidates.length < 1) {
            return new ArrayList<>();
        }
        // 注意：这里start的作用，防止每次遍历都从0开始，导致结果集中有重复的集合
        dfs(candidates, target, 0, new ArrayList<>(),0);
        return ret;
    }

    private static void dfs(int[] candidates, int target, int curSum, ArrayList<Integer> ints, int start) {
        if (curSum == target) {
            ret.add(new ArrayList<>(ints));
            return;
        }
        if (curSum > target) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            ints.add(candidates[i]);
            curSum = curSum + candidates[i];
            dfs(candidates, target, curSum, ints, i);
            curSum = curSum - ints.get(ints.size()-1);
            ints.remove(ints.size() - 1);
        }
    }

    public static void main(String[] args) {
        combinationSum(new int[]{2, 3, 6, 7}, 7);
    }
}
