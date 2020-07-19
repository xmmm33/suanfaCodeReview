package JianZhiOffer;

/**
 * @author humingjiang 2020-07-19 15:22
 **/
public class printNumbers {
    /**
     * 从1打印数字
     * @param n
     * @return
     */
    public int[] printNumbers(int n) {
        int len = (int) (Math.pow(10, n) - 1);
        int[] ret = new int[len];
        for (int i = 0; i < len; i++) {
            ret[i] = i+1;
        }
        return ret;
    }
}