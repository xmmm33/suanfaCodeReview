package JianZhiOffer;

/**
 * @author humingjiang 2020-07-19 10:46
 **/
public class replaceSpace {

    /**
     * 替换空格
     * @param s
     * @return
     */
    public String replaceSpace(String s) {
        int spacecnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                spacecnt++;
            }
        }
        char[] ret = new char[s.length() + 2 * spacecnt];
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                ret[k++] = '%';
                ret[k++] = '2';
                ret[k++] = '0';
            }else {
                ret[k++] = s.charAt(i);
            }
        }
        return new String(ret);
    }
}