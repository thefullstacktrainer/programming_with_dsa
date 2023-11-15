package org.excelr.day6.dp;

public class FibonacciTabulation {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        // Build up the table from the bottom
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }


    public static void main(String[] args) {
        int n = 10; // Change this value to calculate a different Fibonacci number
        int result = fibonacci(n);

        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }
}
