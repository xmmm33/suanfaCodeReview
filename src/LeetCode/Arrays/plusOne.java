package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class plusOne {


    public static void main(String[] args) {
        plusOne(new int[]{9});
    }
    /**
     * 加一
     * @param digits
     * @return
     */
    public static int[] plusOne(int[] digits) {
        if (digits == null || digits.length < 1) {
            return new int[0];
        }
        int jinWei = 0;
        List<Integer> fuzhi = new ArrayList<>();
        for (int i = digits.length - 1; i >= 0; i--) {
            int temp = 0;
            if (i == digits.length - 1) {
                temp = digits[i] + 1;
            }else {
                temp = digits[i] + jinWei;
            }
            fuzhi.add(0,temp % 10);
            jinWei = temp / 10;
        }
        while (jinWei > 0) {
            fuzhi.add(0, jinWei % 10);
            jinWei /= 10;
        }
        int[] ret = new int[fuzhi.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = fuzhi.get(i);
        }
        return ret;
    }
}
