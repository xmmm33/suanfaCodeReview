package JianZhiOffer;

/**
 * @author humingjiang 2020-07-25 16:00
 **/
public class firstUniqChar {

    /**
     * 找到第一个只出现一次的字符
     * @param s
     * @return
     */
    public char firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                return s.charAt(i);
            }
        }
        return ' ';
    }
}