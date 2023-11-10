package org.excelr.day3.space_complexity;

public class LogarithmicSpaceExample {
    public static void main(String[] args) {
        // Logarithmic space complexity - O(log n)
        int n = 16;
        int result = powerOfTwo(n);

        System.out.println("2 to the power of " + n + " is: " + result);
    }

    private static int powerOfTwo(int n) {
        // Recursive function with logarithmic space complexity
        if (n == 0) {
            return 1;
        } else {
            int halfPower = powerOfTwo(n / 2);
            return halfPower * halfPower;
        }
    }
}
