package LeetCode.Strings;

/**
 * @author humingjiang 2020-07-11 15:28
 **/
public class strStr {

    public static void main(String[] args) {
        strStr("", "");
    }

    public static int strStr(String haystack, String needle) {
        int L = needle.length(), n = haystack.length();

        for (int start = 0; start < n - L + 1; start++) {
            if (haystack.substring(start, start + L).equals(needle)) {
                return start;
            }
        }
        return -1;
    }
}