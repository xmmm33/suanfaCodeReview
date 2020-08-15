package LeetCode;

import java.util.Arrays;

/**
 * @author humingjiang 2020-08-08 17:17
 **/
public class tallestBillboard {

    public static void main(String[] args) {
        tallestBillboard(new int[]{1, 2, 3, 6});
    }

    /**
     * 最高的广告牌
     * 举一个简单的例子：
     *                  rods=[5,9]
     *                  dp[2][9-5]=min(5,9)=5
     *                  表示的是前2根管子，组成左、右堆的高度差为4时，最大的公共高度是5
     * @param rods
     * @return
     */
    public static int tallestBillboard(int[] rods) {
        int s = 0;
        for (int i = 0; i < rods.length; i++) {
            s += rods[i];
        }
        int[] dp = new int[s + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        for (int h : rods) {
            int[] current = dp.clone();
            for (int i = 0; i <= s - h; i++) {
                if (current[i] < 0) continue;
                dp[i + h] = Math.max(dp[i + h], current[i]);
                dp[Math.abs(i - h)] = Math.max(dp[Math.abs(i - h)], current[i] + Math.min(h, i));
            }
        }
        return dp[0];
    }
}