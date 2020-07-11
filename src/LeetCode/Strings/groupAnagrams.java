package LeetCode.Strings;

import java.util.*;

/**
 * @author humingjiang 2020-07-11 16:58
 **/
public class groupAnagrams {

    public static void main(String[] args) {
        groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    }
    /**
     * 字母异词分组
     * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
     * 输出:
     * [
     *   ["ate","eat","tea"],
     *   ["nat","tan"],
     *   ["bat"]
     * ]
     * @param strs
     * @return
     */
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length < 1) {
            return new ArrayList<>();
        }
        HashMap<String, List<String>> temp = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] a = strs[i].toCharArray();
            Arrays.sort(a);
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < a.length; j++) {
                sb.append(a[j]);
            }
            if (temp.containsKey(sb.toString())) {
                temp.get(sb.toString()).add(strs[i]);
            }else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                temp.put(sb.toString(), list);
            }
        }
        List<List<String>> ret = new ArrayList<>();
        for (String key : temp.keySet()) {
            ret.add(temp.get(key));
        }
        return ret;
    }
}