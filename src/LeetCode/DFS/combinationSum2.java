package LeetCode.DFS;

import java.util.*;

public class combinationSum2 {

    public static void main(String[] args) {
//        combinationSum2(new int[]{2, 5, 2, 1, 2}, 5);
        combinationSum3(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
    }
    /**
     * 组合总和2，candidates中有重复的数字
     * 这种方式使用Set来去重
     * @param candidates
     * @param target
     * @return
     */
    private static Set<List<Integer>> ret = new HashSet<>();

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates == null || candidates.length < 1) {
            return new ArrayList<>();
        }
        dfs(candidates, target, 0, new ArrayList<Integer>());
        List<List<Integer>> res = new ArrayList<>();
        res.addAll(ret);
        return res;
    }

    private static void dfs(int[] candidates, int target, int pos, ArrayList<Integer> integers) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            List<Integer> temp = new ArrayList<>(integers);
            Collections.sort(temp);
            ret.add(temp);
            return;
        }
        for (int i = pos; i < candidates.length; i++) {
            target = target - candidates[i];
            integers.add(candidates[i]);
            dfs(candidates, target, i+1, integers);
            target = target + integers.get(integers.size() - 1);
            integers.remove(integers.size() - 1);
        }
    }

    // -------------------------------------------------------------------------------------------

    /**
     * 组合和
     * 采用排序去重
     * @param candidates
     * @param target
     * @return
     */
    private static List<List<Integer>> ret2 = new ArrayList<>();

    public static List<List<Integer>> combinationSum3(int[] candidates, int target) {
        if (candidates == null || candidates.length < 1) {
            return new ArrayList<>();
        }
        Arrays.sort(candidates);
        dfss(candidates, target, 0, new ArrayList<Integer>());
        return ret2;
    }

    private static void dfss(int[] candidates, int target, int index, ArrayList<Integer> integers) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            ret2.add(new ArrayList<>(integers));
        }
        for (int i = index; i < candidates.length; i++) {
            // 这行代码是精髓
            // i > index 保证了同一深度的递归不能添加重复的元素
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            target = target - candidates[i];
            integers.add(candidates[i]);
            dfss(candidates, target, i+1, integers);
            target = target + integers.get(integers.size() - 1);
            integers.remove(integers.size() - 1);
        }
    }

}
