package JianZhiOffer;

/**
 * @author humingjiang 2020-07-19 11:28
 **/
public class numWays {
    /**
     * 青蛙跳台阶
     * @param n
     * @return
     */
    public int numWays(int n) {
        if (n == 0) {
            return 1;
        }
        if (n <= 3) {
            return n;
        }
        int low = 2;
        int high = 3;
        int ret = 0;
        for (int i = 4; i <= n; i++) {
            ret = (low + high) % 1000000007;
            low = high;
            high = ret;
        }
        return ret;
    }
}