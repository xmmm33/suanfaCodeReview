package LeetCode;

/**
 * @author humingjiang 2020-08-08 15:47
 **/
public class shortestPalindrome {

    public static void main(String[] args) {
        System.out.println(shortestPalindrome("aabc"));
    }
    /**
     * 最短回文字串
     * @param s
     * @return
     */
    public static String shortestPalindrome(String s) {
        int end = s.length() - 1;
        int trueEnd = end;
        for (int i = end; i > 0; i--) {
            if (isHuiWen(s, 0, i)) {
                trueEnd = i;
                break;
            }
        }
        return new StringBuilder(s.substring(trueEnd + 1)).reverse() + s;
    }

    private static boolean isHuiWen(String s, int start, int end) {
        char[] chars = s.toCharArray();
        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            end--;
            start++;
        }
        return true;
    }

}