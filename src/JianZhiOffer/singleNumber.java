package JianZhiOffer;

/**
 * @author humingjiang 2020-07-25 17:37
 **/
public class singleNumber {

    public static void main(String[] args) {
        singleNumber(new int[]{3, 4, 3, 3});
    }
    public static int singleNumber(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            ret = ret ^ nums[i];
        }
        return ret;
    }
}