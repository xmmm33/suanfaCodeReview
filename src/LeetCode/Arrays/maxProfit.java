package LeetCode.Arrays;

/**
 * @author humingjiang 2020-07-03 21:06
 **/
public class maxProfit {

    public static void main(String[] args) {
        maxProfit2(new int[]{7, 1, 5, 3, 6, 4});
    }
    /**
     * 买股票的最大收益
     * 动态规划，时间复杂度高了
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 1) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int[] dp = new int[prices.length];
        for (int i = 1; i < prices.length; i++) {
            for (int j = 0; j <= i; j++) {
                dp[i] = Math.max(dp[i], prices[i] - prices[j]);
                max = Math.max(dp[i], max);
            }
        }
        return max;
    }

    /**
     *
     * @param prices
     * @return
     */
    public static int maxProfit2(int[] prices) {
        int max = 0;
        // 定一个买入价格，只要遍历到买入价格mairu大于当前价格的时候，就更新当前价格为mairu价格
        int mairu = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (mairu > prices[i]) {
                mairu = prices[i];
            }
            max = Math.max(max, prices[i] - mairu);
        }
        return max;
    }
}