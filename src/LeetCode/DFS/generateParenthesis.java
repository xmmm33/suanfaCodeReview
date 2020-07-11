package LeetCode.DFS;

import java.util.ArrayList;
import java.util.List;

/**
 * @author humingjiang 2020-07-11 14:47
 **/
public class generateParenthesis {

    public static void main(String[] args) {
        generateParenthesis(3);
    }
    private static List<String> ret = new ArrayList<>();
    /**
     * 生成括号
     * @param n
     * @return
     */
    public static List<String> generateParenthesis(int n) {
        if (n < 1) {
            return new ArrayList<>();
        }
        dfs(0, 0, n,"");
        return ret;
    }

    private static void dfs(int left, int right, int n, String path) {
        if (right > left || left > n || right > n) {
            return;
        }
        if (left == n && right == n) {
            ret.add(path);
            return;
        }
        dfs(left + 1, right, n, path + "(");
        dfs(left, right + 1, n, path + ")");
        return;
    }
}