package JianZhiOffer;

/**
 * @author humingjiang 2020-07-19 15:48
 **/
public class isNumber {

    /**
     * 判断一个字符串是否是数字
     * @param s
     * @return
     */
    public boolean isNumber(String s) {
        if (s.length() < 1) {
            return false;
        }
        // 到目前是否为数字
        boolean num = false;
        // 到目前是否出现过小数点
        boolean dot = false;
        // 到目前为止是否出现过e
        boolean e = false;
        char[] temp = s.trim().toCharArray();
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] >= '0' && temp[i] <= '9') {
                num = true;
            } else if (temp[i] == '.') {
                // 小数点之前不能出现小数点
                if (dot || e) {
                    return false;
                }
                dot = true;
            } else if (temp[i] == 'e' || temp[i] == 'E') {
                if (e || !num) {
                    return false;
                }
                e = true;
                num = false;
            } else if (temp[i] == '+' || temp[i] == '-') {
                if (i != 0 && temp[i - 1] != 'e' && temp[i - 1] != 'E') {
                    return false;
                }
            }else {
                return false;
            }
        }
        return num;
    }

    public boolean isNumber2(String s) {
        if (s == null || s.length() < 1) {
            return false;
        }
        boolean num = false;
        boolean dot = false;
        boolean e = false;
        char[] chars = s.trim().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                num = true;
            } else if (chars[i] == '.') {
                if (dot || !num) {
                    return false;
                }
                dot = true;
            } else if (chars[i] == 'e' || chars[i] == 'E') {
                if (e || !num) {
                    return false;
                }
                e = true;
                num = false;
            } else if (chars[i] == '+' || chars[i] == '-') {
                if (i > 0 && chars[i - 1] != 'e' && chars[i - 1] != 'E') {
                    return false;
                }
            }else {
                return false;
            }
        }
        return num;
    }
}