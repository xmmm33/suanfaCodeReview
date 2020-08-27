import org.omg.CORBA.MARSHAL;

import java.util.Scanner;

public class class2 {

    /**
     * 1
     * 2 1 2
     * 3 4 2 1 3
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mart = new int[n][2 * n - 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * (i + 1) - 1; j++) {
                mart[i][j] = sc.nextInt();
            }
        }
        if (n < 2) {
            System.out.println(mart[0][0]);
            return;
        }
        int[][] dp = new int[n][2 * n - 1];
        for (int i = 0; i < mart[n - 1].length; i++) {
            dp[n - 1][i] = mart[n - 1][i];
        }
        int maxret = 0;
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < 2 * (i + 1) - 1; j++) {
                dp[i][j] = Math.max(dp[i + 1][j], Math.max(dp[i + 1][j + 1], dp[i + 1][j + 2])) + mart[i][j];
                maxret = dp[i][j];
            }
        }
        System.out.println(maxret);
    }
}
