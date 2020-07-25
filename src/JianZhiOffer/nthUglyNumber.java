package JianZhiOffer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author humingjiang 2020-07-25 15:26
 **/
public class nthUglyNumber {

    /**
     * 求第n个丑数 只包含2 3 5因子的数
     * @param n
     * @return
     */
    public int nthUglyNumber(int n) {
        List<Integer> temp = new ArrayList<>();
        int two = 0;
        int three = 0;
        int five = 0;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                temp.add(1);
            }
            int a = Math.min(temp.get(two) * 2, Math.min(temp.get(three) * 3, temp.get(five) * 5));
            if (a == temp.get(two) * 2) {
                two++;
            }
            if (a == temp.get(three) * 3) {
                three++;
            }
            if (a == temp.get(five) * 5) {
                five++;
            }
            temp.add(a);
        }
        return temp.get(n-1);
    }
}