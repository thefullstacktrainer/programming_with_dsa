package org.excelr.day6.dp;

public class StairClimbing {

    public static int countWays(int n) {
        if (n <= 2) {
            return n;
        } else {
            int[] dp = new int[n + 1];
            dp[1] = 1;
            dp[2] = 2;

            for (int i = 3; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }

            return dp[n];
        }
    }

    public static void main(String[] args) {
        int n = 7; // Change this value to the desired number of stairs
        int ways = countWays(n);

        System.out.println("Number of ways to reach the top: " + ways);
    }
}
