package LeetCode.Strings;

import java.util.HashMap;
import java.util.Map;

public class lengthOfLongestSubstring {


    /**
     * 无重复的最长字串
     * 思路：就是滑动窗口，如果map中包含当前遍历字符，说明字符串有重复字符了，然后就更新滑动窗口的左边界left；
     * 输入: "abcabcbb"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() < 1) {
            return 0;
        }
        Map<Character, Integer> slideWindow = new HashMap<>();
        int ret = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (slideWindow.containsKey(s.charAt(i))) {
                left = Math.max(left, slideWindow.get(s.charAt(i)) + 1);
            }
            slideWindow.put(s.charAt(i), i);
            ret = Math.max(ret, i - left + 1);
        }
        return ret;
    }

}
