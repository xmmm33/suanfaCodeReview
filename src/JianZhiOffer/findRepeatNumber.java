package JianZhiOffer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author humingjiang 2020-07-19 10:35
 **/
public class findRepeatNumber {

    /**
     * 寻找数组中重复的数字
     * @param nums
     * @return
     */
    public int findRepeatNumber(int[] nums) {
        if (nums == null || nums.length < 1) {
            return -1;
        }
        Set<Integer> temp = new HashSet<>();
        for (int num : nums) {
            if (!temp.add(num)) {
                return num;
            }
        }
        return -1;
    }
}