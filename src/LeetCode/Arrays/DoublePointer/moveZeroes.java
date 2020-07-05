package LeetCode.Arrays.DoublePointer;

/**
 * @author humingjiang 2020-07-05 15:13
 **/
public class moveZeroes {

    public static void main(String[] args) {
        moveZeroes(new int[]{0, 1, 0, 3, 12});
    }
    /**
     * 移动零
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length < 1) {
            return;
        }
        int nonzero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonzero++] = nums[i];
            }
        }
        for (int i = nonzero; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}