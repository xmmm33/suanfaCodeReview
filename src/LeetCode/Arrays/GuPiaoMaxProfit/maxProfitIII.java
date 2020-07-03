package LeetCode.Arrays.GuPiaoMaxProfit;

public class maxProfitIII {


    public static void main(String[] args) {
        maxProfit(new int[]{1, 2, 3, 4, 5});
    }
    /**
     * 股票收益最大，允许最多两次交易
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 1) {
            return 0;
        }
        int low = 0;
        int high = 0;
        int max = 0;
        int mairu = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (mairu > prices[i]) {
                mairu = prices[i];
                continue;
            }
            int temp = prices[i] - mairu;
            if (max == 0) {
                max = max + temp;
                low = temp;
                high = temp;
                mairu = Integer.MAX_VALUE;
                continue;
            }
            if (temp >= high) {
                low = high;
                high = temp;
                max = max + high;
                mairu = Integer.MAX_VALUE;
            } else if (temp > low) {
                low = temp;
                max = max + high;
                mairu = Integer.MAX_VALUE;
            }
        }
        return max;
    }
}
