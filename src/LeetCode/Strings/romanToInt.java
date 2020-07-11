package LeetCode.Strings;

/**
 * @author humingjiang 2020-07-11 11:38
 **/
public class romanToInt {
    public static void main(String[] args) {
        romanToInt("IV");
    }
    /**
     * 罗马字符串转换成整数
     * @param s
     * @return
     */
    public static int romanToInt(String s) {
        if (s == null || s.length() < 1) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'M') {
                res = res + 1000;
            } else if (c == 'D') {
                res = res + 500;
            } else if (c == 'C') {
                res = res + 100;
                if (i < s.length() - 1 && s.charAt(i + 1) == 'D') {
                    res = res - 100 + 400;
                    i++;
                    continue;
                }
                if (i < s.length() - 1 && s.charAt(i + 1) == 'M') {
                    res = res - 100 + 900;
                    i++;
                    continue;
                }
            } else if (c == 'L') {
                res = res + 50;
            } else if (c == 'X') {
                res = res + 10;
                if (i < s.length() - 1 && s.charAt(i + 1) == 'L') {
                    res = res - 10 + 40;
                    i++;
                    continue;
                }
                if (i < s.length() - 1 && s.charAt(i + 1) == 'C') {
                    res = res - 10 + 90;
                    i++;
                    continue;
                }
            } else if (c == 'V') {
                res = res + 5;
            } else if (c == 'I') {
                res = res + 1;
                if (i < s.length() - 1 && s.charAt(i + 1) == 'V') {
                    res = res - 1 + 4;
                    i++;
                    continue;
                }
                if (i < s.length() - 1 && s.charAt(i + 1) == 'X') {
                    res = res - 1 + 9;
                    i++;
                    continue;
                }
            }
        }
        return res;
    }
}