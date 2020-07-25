package JianZhiOffer;

/**
 * @author humingjiang 2020-07-25 15:03
 **/
public class translateNum {

    /**
     * 一个数子能翻译成多少种字符串
     * 青蛙跳台阶的变形题
     * @param num
     * @return
     */
    public int translateNum(int num) {
        String string = String.valueOf(num);
        int a = 1;
        int b = 1;
        for (int i = 2; i <= string.length(); i++) {
            String temp = string.substring(i - 2, i);
            int c = temp.compareTo("10") >= 0 && temp.compareTo("25") <= 0 ? a + b : a;
            b = a;
            a = c;
        }
        return a;
    }
}