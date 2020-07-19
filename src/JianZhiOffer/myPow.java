package JianZhiOffer;

/**
 * @author humingjiang 2020-07-19 15:09
 **/
public class myPow {
    /**
     * 数值的整数次方
     * 还是二进制的思想：
     * 比如一个整数9；用二进制可以表示为1001，1x2^3 + 0x2^2 + 0x2^1 + 1*2^0
     * 那么一个整数的x的n次方，x^(1x2^3) * x^(0x2^2) * x^(0x2^1) + x^(1*2^0) = x^1 * x^0 * x^0 * x^8;
     * @param x
     * @param n
     * @return
     */
    public double myPow(double x, int n) {
        if (x == 0) {
            return 0;
        }
        long cifang = n;
        double ret = 1.0;
        if (cifang < 0) {
            x = 1 / x;
            cifang = -cifang;
        }
        while (cifang > 0) {
            if ((cifang & 1) == 1) {
                ret = ret * x;
            }
            x = x * x;
            cifang = cifang >> 1;
        }
        return ret;
    }
}