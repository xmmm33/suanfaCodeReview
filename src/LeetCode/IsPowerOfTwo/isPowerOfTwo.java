package LeetCode.IsPowerOfTwo;

/**
 * @author humingjiang 2020-07-05 16:38
 **/
public class isPowerOfTwo {

    /**
     * 判断一个数是否是2的幂
     * 从二进制上看，2的幂一定是这样的形式：整个二进制数上只有一位是1，其他位全是0；（如果有两个1，一定不是2的幂）
     * 此时，n-1的二进制数一定会是当前位变为0，其他位全是1，这样n与n-1操作，就会是0；
     */
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}