package org.excelr.day6;

public class Fibonacci {

    public static int fibonacci(int n) {
        // Base cases
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            // Recursive case: F(n) = F(n-1) + F(n-2)
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 5; // Change this value to calculate a different Fibonacci number
        int result = fibonacci(n);

        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }
}

