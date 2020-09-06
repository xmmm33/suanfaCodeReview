import java.util.*;

public class Solution {

    static Set<Character> dot = new HashSet<>();

    public static void main(String[] args) {
        dot.add('.');
        dot.add(',');
        dot.add('!');
        dot.add('?');
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split(";");
        String reg = ",+|.+|!+";

        int i = minlength(split[0], split[1]);
        int max = getLength(split[1]);
        System.out.println("(" + i + "," + max + ")");
    }

    private static int minlength(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i <= n; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i][j - 1], dp[i - 1][j]));
                }
            }
        }
        return dp[m][n];
    }

    private static int getLength(String diff) {
        diff = diff.trim();
        int i = 0;
        int len = 0;
        while (i < diff.length()) {
            if (diff.charAt(i) >= '0' && diff.charAt(i) <= '9') {
                i++;
                while (diff.charAt(i) >= '0' && diff.charAt(i) <= '9') {
                    i++;
                }
                len++;
            } else if (dot.contains(diff.charAt(i))) {
                len++;
                i++;
            } else if (diff.charAt(i) == ' ') {
                while (diff.charAt(i) == ' ') {
                    i++;
                }
            } else {
                while ((diff.charAt(i) >= 'a' && diff.charAt(i) <= 'z') || (diff.charAt(i) >= 'A' && diff.charAt(i) <= 'Z')) {
                    i++;
                }
                len++;
            }

        }
        return len;
    }
}
