package org.excelr.day6;

public class RecursionPrograms {
    public static void main(String[] args) {
        System.out.println("Print numbers in range");
        printNumbersInRange(4,10);
        System.out.println();
        System.out.println("----------------------");
        System.out.println("GCD");
        int gcdResult = gcd(4,16);
        System.out.println(gcdResult);
        System.out.println("----------------------");
        String inputString = "abcd";

        System.out.println("Subsets of " + inputString + ":");
        generateSubsets(inputString, "", 0);
    }

    public static void printNumbersInRange(int start, int end) {
        if (start <= end) {
            System.out.print(start + " ");
            printNumbersInRange(start + 1, end);
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void generateSubsets(String input, String output, int index) {
        if (index == input.length()) {
            System.out.println(output);
            return;
        }

        // Exclude the current character
        generateSubsets(input, output, index + 1);

        // Include the current character
        generateSubsets(input, output + input.charAt(index), index + 1);
    }

    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        } else {
            return (str.charAt(start) == str.charAt(end)) &&
                    isPalindrome(str, start + 1, end - 1);
        }
    }

    public static void generatePermutations(String input, String output) {
        if (input.isEmpty()) {
            System.out.println(output);
            return;
        }

        for (int i = 0; i < input.length(); i++) {
            char chosen = input.charAt(i);
            String remaining = input.substring(0, i) + input.substring(i + 1);
            generatePermutations(remaining, output + chosen);
        }
    }

    public static void generateParentheses(int n, String current, int open, int close) {
        if (current.length() == 2 * n) {
            System.out.println(current);
            return;
        }

        if (open < n) {
            generateParentheses(n, current + "(", open + 1, close);
        }

        if (close < open) {
            generateParentheses(n, current + ")", open, close + 1);
        }
    }


    public static void towerOfHanoi(int n, char source, char auxiliary, char destination) {
        if (n > 0) {
            // Move n-1 disks from source to auxiliary peg
            towerOfHanoi(n - 1, source, destination, auxiliary);

            // Move the nth disk from source to destination peg
            System.out.println("Move disk " + n + " from " + source + " to " + destination);

            // Move the n-1 disks from auxiliary to destination peg
            towerOfHanoi(n - 1, auxiliary, source, destination);
        }
    }


}
