package LeetCode.Arrays.GuPiaoMaxProfit;

/**
 * @author humingjiang 2020-07-03 21:28
 **/
public class maxProfitII {


    public static void main(String[] args) {
        maxProfit(new int[]{7, 1, 5, 3, 6, 4});
    }
    /**
     * 购买股票获得的最大利润是多少，不同于上一题的是可以多次购买和卖出股票
     * 思路:
     *      7, 1, 5, 6] 第二天买入，第四天卖出，收益最大（6-1），
     *      所以一般人可能会想，怎么判断不是第三天就卖出了呢?
     *      这里就把问题复杂化了，根据题目的意思，当天卖出以后，当天还可以买入，所以其实可以第三天卖出，第三天买入，第四天又卖出（（5-1）+ （6-5） === 6 - 1）。
     *      所以算法可以直接简化为只要今天比昨天大，就卖出。
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 1) {
            return 0;
        }
        int max = 0;
        int mairu = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (mairu > prices[i]) {
                mairu = prices[i];
                continue;
            }
            max = max + prices[i] - mairu;
            mairu = prices[i];
        }
        return max;
    }
}