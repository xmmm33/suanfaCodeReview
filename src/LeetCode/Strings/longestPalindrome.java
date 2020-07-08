package LeetCode.Strings;

public class longestPalindrome {

    /**
     * 最长回文字串；经典题
     * 思路：就是使用最长公共字串的方法来做，因为最长回文串相当于把原字符串反转，然后找最长公共字串
     *      但是要注意个特殊的问题，例如S="abc435cba"，S="abc534cba"，最长公共子串是 "abc" 和 "cba"，但很明显这两个字符串都不是回文串。
     *      所以需要在更新maxlen的时候判断一下 --该字符串倒置前的下标和当前的字符串下标是不是匹配--。
     */
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        int maxlen = 0;
        int maxend = 0;
        int[][] dp = new int[s.length()][s.length()];
        String reverse = new StringBuilder(s).reverse().toString();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == reverse.charAt(j)) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    }else {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    }
                }
                // 这里要判断 该字符串倒置前的下标和当前的字符串下标是不是匹配
                if (dp[i][j] > maxlen) {
                    // 当前字符倒置前的开始下标
                    int beforeindex = s.length() - 1 - j;
                    // 加上当前字符串长度 就是尾部下标
                    if (beforeindex + dp[i][j] - 1 == i) {
                        maxlen = dp[i][j];
                        maxend = i;
                    }
                }
            }
        }
        return s.substring(maxend - maxlen + 1, maxend + 1);
    }
}
