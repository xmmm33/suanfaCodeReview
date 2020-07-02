package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class generate {


    public static void main(String[] args) {
        generate(5);
    }
    /**
     * 杨辉三角
     * @param numRows
     * @return
     */
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> tmep = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (i > 1) {
                    if (j == 0 || j == i-1) {
                        tmep.add(1);
                    }else {
                        tmep.add(ret.get(i - 2).get(j - 1) + ret.get(i - 2).get(j));
                    }
                }else {
                    tmep.add(1);
                }
            }
            ret.add(tmep);
        }
        return ret;
    }
}
