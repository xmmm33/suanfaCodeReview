package LeetCode.Strings;

import java.util.ArrayList;
import java.util.List;

/**
 * @author humingjiang 2020-07-11 13:57
 **/
public class letterCombinations {

    public static void main(String[] args) {
        letterCombinations("23");
    }
    private static List<String> ret = new ArrayList<>();

    private static String[] numbers = new String[]{"","","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    /**
     * 电话号码的组合
     * @param digits
     * @return
     */
    public static List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() < 1) {
            return new ArrayList<>();
        }
        int n = digits.length();
        char[] nums = digits.toCharArray();
        dfs("", n, nums,0);
        return ret;
    }

    private static void dfs(String path, int n, char[] nums, int pos) {
        if (pos == n) {
            ret.add(path);
            return;
        }
        String number = numbers[nums[pos] - '0'];
        for (int i = 0; i < number.length(); i++) {
            dfs(path + number.charAt(i), n, nums, pos + 1);
        }
    }
}