package JianZhiOffer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author humingjiang 2020-07-25 11:15
 **/
public class permutation {

    Set<String> temp = new HashSet<>();

    /**
     * 字符串的全排列
     *
     * @param s
     * @return
     */
    public String[] permutation(String s) {
        if (s == null || s.length() < 1) {
            return new String[0];
        }
        char[] chars = s.toCharArray();
        boolean[] vis = new boolean[chars.length];
        dfs(chars, new StringBuilder(), vis);
        return temp.toArray(new String[0]);
    }

    private void dfs(char[] chars, StringBuilder strs, boolean[] vis) {
        if (strs.length() == chars.length) {
            temp.add(strs.toString());
            return;
        }
        for (int i = 0; i < chars.length; i++) {
            if (vis[i]) {
                continue;
            }
            vis[i] = true;
            strs.append(chars[i]);
            dfs(chars, strs, vis);
            vis[i] = false;
            strs.deleteCharAt(strs.length() - 1);
        }
    }

    List<String> result = new ArrayList<>();

    public String[] permutation2(String s) {
        if (s == null || s.length() == 0) {
            return new String[0];
        }
        boolean[] vis = new boolean[s.length()];
        char[] chars = s.toCharArray();
        dfs2(chars, new StringBuilder(), vis);
        return result.toArray(new String[0]);
    }

    private void dfs2(char[] chars, StringBuilder stringBuilder, boolean[] vis) {
        if (stringBuilder.length() == chars.length) {
            result.add(new String(stringBuilder));
            return;
        }
        for (int i = 0; i < chars.length; i++) {
            if (vis[i]) {
                continue;
            }
            vis[i] = true;
            stringBuilder.append(chars[i]);
            dfs(chars, stringBuilder, vis);
            vis[i] = false;
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }
}