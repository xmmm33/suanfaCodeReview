package JianZhiOffer;

/**
 * @author humingjiang 2020-07-19 14:41
 **/
public class cuttingRope {

    /**
     * 剪绳子
     * @param n
     * @return
     */
    public int cuttingRope(int n) {
        if (n <= 3) {
            return (n - 1);
        }
        int ret = 1;
        while (n > 4) {
            ret = ret * 3;
            n = n - 3;
        }
        ret = ret * 4;
        return ret;
    }
}