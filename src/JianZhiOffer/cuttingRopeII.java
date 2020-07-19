package JianZhiOffer;

/**
 * @author humingjiang 2020-07-19 14:47
 **/
public class cuttingRopeII {

    /**
     * 剪绳子，考虑数据的溢出
     * @param n
     * @return
     */
    public int cuttingRope(int n) {
        if (n <= 3) {
            return (n - 1);
        }
        long ret = 1;
        while (n > 4) {
            ret = ret * 3;
            ret = ret % 1000000007;
            n = n - 3;
        }
        ret = (ret * n) % 1000000007;
        return (int) ret;
    }
}