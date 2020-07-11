package LeetCode.Strings;

/**
 * @author humingjiang 2020-07-11 16:31
 **/
public class multiply {

    /**
     * 字符串乘法
     * @param num1
     * @param num2
     * @return
     */
    public String multiply(String num1, String num2) {
        /**
         num1的第i位(高位从0开始)和num2的第j位相乘的结果在乘积中的位置是[i+j, i+j+1]
         例: 123 * 45,  123的第1位 2 和45的第0位 4 乘积 08 存放在结果的第[1, 2]位中
         index:    0 1 2 3 4

                       1 2 3
                     *   4 5
                     ---------
                         1 5
                       1 0
                     0 5
                     ---------
                       0 6 1 5
                         1 2
                       0 8
                     0 4
                     ---------
                     0 5 5 3 5
         这样我们就可以单独都对每一位进行相乘计算把结果存入相应的index中
         **/
        int[] temp = new int[num1.length() + num2.length()];
        int n1 = num1.length() - 1;
        int n2 = num2.length() - 1;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                int cur = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                cur = cur + temp[i + j + 1];
                temp[i + j] = temp[i + j] + cur / 10;
                temp[i + j + 1] = temp[i + j + 1] + cur % 10;
            }
        }
        StringBuilder ret = new StringBuilder();
        int i = 0;
        // 去除数组前面的0
        while (i < temp.length && temp[i] == 0) {
            i++;
        }
        for (int j = i; j < temp.length; j++) {
            ret.append(temp[i]);
        }
        return ret.toString();
    }
}