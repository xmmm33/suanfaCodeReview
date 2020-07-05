package LeetCode.DP;

/**
 * @author humingjiang 2020-07-05 16:08
 **/
public class climbStairs {

    /**
     * 爬楼梯，每次只能爬1或2楼，问爬到n楼有多少种爬法
     * 经典动态规划题
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int low = 1;
        int high = 2;
        int temp = 0;
        for (int i = 3; i <= n; i++) {
            temp = low + high;
            low = high;
            high = temp;
        }
        return temp;
    }
}