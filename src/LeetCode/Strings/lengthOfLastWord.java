package LeetCode.Strings;

/**
 * @author humingjiang 2020-07-11 17:11
 **/
public class lengthOfLastWord {

    /**
     * 最后一个单词的长度
     * @param s
     * @return
     */
    public int lengthOfLastWord(String s) {
        String[] strings = s.split(" ");
        if (strings != null && strings.length > 0) {
            return strings[strings.length - 1].length();
        }else {
            return 0;
        }
    }
}