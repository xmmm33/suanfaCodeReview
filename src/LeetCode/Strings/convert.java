package LeetCode.Strings;

import java.util.ArrayList;
import java.util.List;

/**
 * @author humingjiang 2020-07-11 10:35
 **/
public class convert {

    /**
     * Z字形打印字符串
     * @param s
     * @param numRows
     * @return
     */
    public String convert(String s, int numRows) {
        if (numRows < 2) {
            return s;
        }
        List<StringBuilder> ret = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            ret.add(new StringBuilder());
        }
        int i = 0;
        int flag = -1;
        for (char c : s.toCharArray()) {
            ret.get(i).append(c);
            if (i == 0 || i == numRows - 1) {
                flag = -flag;
            }
            i = i + flag;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder stringBuilder : ret) {
            res.append(stringBuilder.toString());
        }
        return res.toString();
    }
}