package LeetCode.Strings;

/**
 * @author humingjiang 2020-07-11 10:52
 **/
public class myAtoi {

    /**
     * 字符串转换整数
     * @param str
     * @return
     */
    public int myAtoi(String str) {
        if (str == null || str.length() < 1) {
            return 0;
        }
        char[] chars = str.toCharArray();
        int index = 0;
        boolean zheng = true;
        // 首先是去掉前面的空格
        while (index < chars.length && chars[index] == ' ') {
            index++;
        }
        // 判断当前的index是否走到了字符数组的末尾
        if (index == chars.length) {
            return 0;
        }
        // 判断当前遇到的符号,或者遇到的不是数字字符
        if (chars[index] == '+') {
            zheng = true;
            index++;
        }else if (chars[index] == '-'){
            zheng = false;
            index++;
        } else if (!Character.isDigit(chars[index])) {
            return 0;
        }
        int res = 1;
        while (index < chars.length && Character.isDigit(chars[index])) {
            int cur = chars[index] - '0';
            if (res > (Integer.MAX_VALUE - cur) / 10) {
                return zheng ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res * 10 + cur;
            index++;
        }
        return zheng ? res : res * -1;
    }
}