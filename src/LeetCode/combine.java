package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author humingjiang 2020-07-31 15:22
 **/
public class combine {

    List<List<Integer>> ret = new ArrayList<>();
    /**
     * 组合
     * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合
     */
    public List<List<Integer>> combine(int n, int k) {
        boolean[] vis = new boolean[n+1];
        dfs(n, k,1, vis,new ArrayList<Integer>());
        return ret;
    }

    private void dfs(int n, int k, int pos,boolean[] vis, ArrayList<Integer> path) {
        if (path.size() == k) {
            ret.add(new ArrayList<>(path));
        }
        for (int i = pos; i <= n; i++) {
            if (vis[i]) {
                continue;
            }
            vis[i] = true;
            path.add(i);
            dfs(n, k, i, vis, path);
            vis[i] = false;
            path.remove(path.size() - 1);
        }
        return;
    }
}