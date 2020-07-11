package LeetCode.Strings;

/**
 * @author humingjiang 2020-07-11 13:33
 **/
public class longestCommonPrefix {

    public static void main(String[] args) {
        longestCommonPrefix(new String[]{"flower", "flow", "flight"});
    }
    /**
     * 最长公共前缀
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length < 1) {
            return "";
        }
        String ret = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            while (j < ret.length() && j < strs[i].length() && ret.charAt(j) == strs[i].charAt(j)) {
                j++;
            }
            ret = ret.substring(0, j);
            if (ret.equals("")) {
                return "";
            }
        }
        return ret;
    }
}