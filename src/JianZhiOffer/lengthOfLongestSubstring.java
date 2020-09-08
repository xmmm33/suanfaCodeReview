package JianZhiOffer;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.Map;

/**
 * @author humingjiang 2020-07-25 15:18
 **/
public class lengthOfLongestSubstring {

    /**
     * 最长不重复的字串
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() < 1) {
            return 0;
        }
        int max = 0;
        Map<Character, Integer> index = new HashMap<>();
        char[] chars = s.toCharArray();
        int left = 0;
        int right = 0;
        while (right < chars.length) {
            if (index.containsKey(chars[right])) {
                // 更新滑动窗口左边界
                left = Math.max(left, index.get(chars[right])+1);
            }
            max = Math.max(max, right - left + 1);
            index.put(chars[right], right);
            right++;
        }
        return max;
    }

    public int lengthOfLongestSubstring2(String s) {
        if (s == null || s.length() < 1) {
            return 0;
        }
        Map<Character, Integer> index = new HashMap<Character, Integer>();
        int max = 0;
        int left = 0;
        int right= 0;
        while (right < s.length()) {
            if (index.containsKey(s.charAt(right))) {
                left = Math.max(left, index.get(s.charAt(right)) + 1);
            }
            max = Math.max(max, right - left + 1);
            index.put(s.charAt(right), right);
            right++;
        }
        return max;
    }
}