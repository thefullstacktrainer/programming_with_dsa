package org.excelr.day6.dp;

public class FibonacciMemoizationArray {

    static int noOfRuns = 0;
    public static int fibonacci(int n) {
        // Array to store previously calculated Fibonacci numbers
        int[] memo = new int[n + 1];
        return fibonacciHelper(n, memo);
    }

    private static int fibonacciHelper(int n, int[] memo) {
        noOfRuns++;
        // Base cases
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        // Check if the result is already memoized
        if (memo[n] != 0) {
            return memo[n];
        } else {
            // Recursive case: F(n) = F(n-1) + F(n-2)
            int result = fibonacciHelper(n - 1, memo) + fibonacciHelper(n - 2, memo);

            // Memoize the result
            memo[n] = result;

            return result;
        }
    }

    public static void main(String[] args) {
        int n = 5; // Change this value to calculate a different Fibonacci number
        int result = fibonacci(n);

        System.out.println("Total calls "+ noOfRuns);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }
}
