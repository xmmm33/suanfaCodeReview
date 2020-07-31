package LeetCode;

/**
 * @author humingjiang 2020-07-31 11:55
 **/
public class myPow {

    public static void main(String[] args) {
        myPow(3, 5);
    }
    /**
     * 快速幂计算x^n
     * 比如  9的5次方
     * 5的二进制位---- 101
     * 第0轮
     * @param x
     * @param n
     * @return
     */
    public static double myPow(double x, int n) {
        double ret = 1.0;
        long cifang = n;
        double dishu = x;
        if (cifang < 0) {
            dishu = 1 / dishu;
            cifang = -cifang;
        }
        while (cifang > 0) {
            if (cifang % 2 == 1) {
                ret = ret * dishu;
            }
            dishu = dishu * dishu;
            cifang = cifang / 2;
        }
        return ret;
    }
}