package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author humingjiang 2020-07-05 11:42
 **/
public class summaryRanges {

    public static void main(String[] args) {
        summaryRanges(new int[]{0,1,2,4,5,7});
    }
    /**
     * 汇总区间
     * @param nums
     * @return
     */
    public static List<String> summaryRanges(int[] nums) {
        if (nums == null || nums.length < 1) {
            return new ArrayList<>();
        }
        List<String> ret = new ArrayList<>();
        if (nums.length == 1) {
            String temp = String.valueOf(nums[0]);
            ret.add(temp);
            return ret;
        }
        StringBuilder stringBuilder = new StringBuilder();
        boolean start = true;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i+1] - nums[i] != 1) {
                if (stringBuilder.toString().length() < 1) {
                    stringBuilder.append(nums[i]);
                }else {
                    stringBuilder.append("->").append(nums[i]);
                }
                ret.add(stringBuilder.toString());
                stringBuilder = new StringBuilder();
                start = true;
            }else {
                if (start) {
                    stringBuilder.append(nums[i]);
                    start = false;
                }
            }
            if (i + 1 == nums.length - 1) {
                if (stringBuilder.toString().length() < 1) {
                    stringBuilder.append(nums[i+1]);
                }else {
                    stringBuilder.append("->").append(nums[i+1]);
                }
                ret.add(stringBuilder.toString());
            }
        }
        return ret;
    }
}