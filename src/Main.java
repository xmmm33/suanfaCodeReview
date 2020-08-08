import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {


    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        Map<String, Integer> danciMap = new HashMap<>();
        for (int i = 0; i < size; i++) {
            String s = sc.nextLine();
            danciMap.put(s, danciMap.getOrDefault(s, 0) + 1);
        }
        int ret = 0;
        for (String key : danciMap.keySet()) {
            Integer cnt = danciMap.get(key);
            if (cnt > size * 0.01) {
                ret++;
            }
        }
        System.out.println(ret);
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String initString = sc.nextLine();
        System.out.println(shortestPalindrome(initString));
    }

    public static boolean isHuiWen(String s, Integer start, Integer end) {
        char[] characters = s.toCharArray();
        while (start < end) {
            if (characters[start] != characters[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static String shortestPalindrome(String s) {
        int end = s.length() - 1;
        //找到回文串的结尾, 用 end 标记
        for (; end > 0; end--) {
            if (isHuiWen(s, 0, end)) {
                break;
            }
        }
        //将末尾的几个倒置然后加到原字符串开头
        return new StringBuilder(s.substring(end + 1)).reverse() + s;
    }
}
