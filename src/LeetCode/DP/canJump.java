package LeetCode.DP;

public class canJump {


    public static void main(String[] args) {
        canJump(new int[]{3, 2, 1, 0, 4});
    }
    /**
     * 跳跃游戏I
     * 思路：
     *      类似跳跃游戏II，我每次都去找我能跳的最远的位置，然后到边界的时候进行更新操作最后能跳到的位置end
     * @param nums
     * @return
     */
    public static boolean canJump(int[] nums) {
        if (nums == null || nums.length < 1) {
            return true;
        }
        int maxPosition = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            maxPosition = Math.max(maxPosition, nums[i] + i);
            if (i == end) {
                end = maxPosition;
                if (end >= nums.length - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
