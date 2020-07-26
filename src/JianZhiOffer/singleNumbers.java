package JianZhiOffer;

/**
 * @author humingjiang 2020-07-25 17:18
 **/
public class singleNumbers {

    /**
     * 找出数组中只出现过一次的两个数字
     * 原理：
         * a^a=0
         * a^0=a
         * a^b^c=a^c^b
         * a&(-a)=最低位为1的二进制（从右到左）
         * 所有的异或结果得到sum=2^10=8
         * flag=-8&8=8
         * 可分为两组，一组为与flag相与等于1的[10]，另一组为0的[1,2,4,1,4,3,3]
         * 组内异或分别得到【10】【2】
     * @param nums
     * @return
     */
    public int[] singleNumbers(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum ^ nums[i];
        }
        // flag字段就是为了把原有数组分成两组 相与计算结果为1 、结果为0
        int flag = (-sum) & sum;
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & flag) == 0) {
                res[0] = res[0] ^ nums[i];
            }else {
                res[1] = res[1] ^ nums[i];
            }
        }
        return res;
    }
}