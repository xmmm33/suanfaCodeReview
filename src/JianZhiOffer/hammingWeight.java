package JianZhiOffer;

/**
 * @author humingjiang 2020-07-19 14:50
 **/
public class hammingWeight {

    /**
     * 二进制中1的个数，也叫汉明距离
     * @param n
     * @return
     */
    public static int hammingWeight(int n) {
        int ret = 0;
        while (n != 0) {
            ret++;
            n = n & (n - 1);
        }
        return ret;
    }

    public static int hammingWeight2(int n) {
        int ret =0;
        while (n != 0) {
            ret = ret + (n & 1);
            // 注意这里要使用无符号的右移
            n = n >>> 1;
        }
        return ret;
    }
}