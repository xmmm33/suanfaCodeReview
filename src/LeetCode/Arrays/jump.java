package LeetCode.Arrays;

public class jump {

    // 跳跃游戏
    public static int jump(int[] nums) {
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for(int i = 0; i < nums.length - 1; i++){
            // 总是找能跳的最远的
            maxPosition = Math.max(maxPosition, nums[i] + i);
            if( i == end){ //遇到边界，就更新边界，并且步数加一
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }

    public static void main(String[] args) {
        jumpPractice(new int[]{2, 3, 1, 1, 4, 2, 1});
    }


    public static int jumpPractice(int[] nums) {
        int maxright = 0;
        int maxJump = 0;
        int step = 0;
        for (int i = 0; i < nums.length-1; i++) {
            // 找到从当前位置能跳到的最远位置
            maxJump = Math.max(maxJump, nums[i] + i);
            if (i == maxright) {
                step++;
                // 更新现在跳了多少次能跳的最远距离
                maxright = maxJump;
            }
        }
        return step;
    }
}
