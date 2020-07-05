package LeetCode.Arrays.SlideWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author humingjiang 2020-07-05 12:08
 **/
public class majorityElement {

    public static void main(String[] args) {
        majorityElement(new int[]{1, 1, 1, 3, 3, 2, 2, 2});
    }
    /**
     * 众数 II
     * @param nums
     * @return
     */
    public static List<Integer> majorityElement(int[] nums) {
        if (nums == null || nums.length < 1) {
            return new ArrayList<>();
        }
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        int low = 0;
        int high = 0;
        while (high < nums.length - 1) {
            if (nums[high] != nums[high + 1]) {
                if (high - low + 1 > nums.length / 3) {
                    temp.add(nums[high]);
                }
                high++;
                low = high;
            } else {
                high++;
            }
        }
        if (high - low + 1 > nums.length / 3) {
            temp.add(nums[high]);
        }
        return temp;
    }
}