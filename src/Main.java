import java.util.*;

/**
 * 笔试用
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] dp = new long[n + 1];
        int two = 0;
        int three = 0;
        int five = 0;
        for (int i = 1; i < dp.length; i++) {
            long num2 = dp[two] * 10 + 2;
            long num3 = dp[three] * 10 + 3;
            long num5 = dp[five] * 10 + 5;
            dp[i] = Math.min(num2, Math.min(num3, num5));
            if (num2 == dp[i]) {
                two++;
            }
            if (num3 == dp[i]) {
                three++;
            }
            if (num5 == dp[i]) {
                five++;
            }
        }
        System.out.println(dp[dp.length - 1]);
    }
}
