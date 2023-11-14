package org.excelr.day5;

public class RecursivePower {

    public static double power(double base, int exponent) {
        // Base case: any number raised to the power of 0 is 1
        if (exponent == 0) {
            return 1;
        } else {
            // Recursive case: base^exponent = base * base^(exponent-1)
            return base * power(base, exponent - 1);
        }
    }

    public static void main(String[] args) {
        double base = 2;
        int exponent = 3;
        System.out.println(base + " raised to the power of " + exponent + " is " + power(base, exponent));
    }
}
