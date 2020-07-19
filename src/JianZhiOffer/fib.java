package JianZhiOffer;

/**
 * @author humingjiang 2020-07-19 11:14
 **/
public class fib {

    /**
     * 斐波拉切数列
     * @param n
     * @return
     */
    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        int low = 1;
        int high = 1;
        int ret = 1;
        for (int i = 3; i <= n; i++) {
            // 防止溢出
            ret = (low + high)%1000000007;
            low = high;
            high = ret;
        }
        return ret;
    }

    public int fib2(int n) {
        if (n < 2) {
            return n;
        }else {
            return fib2(n - 1) + fib(n - 2);
        }
    }
}