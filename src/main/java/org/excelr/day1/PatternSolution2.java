package org.excelr.day1;

public class PatternSolution2 {
    public static void main(String[] args) {
        int n = 5;
        pyramidPattern(n);
        numberPattern();
        numberPattern2();
        numberPattern3();
        numberPattern4();
        charPattern();
        charPattern2();
    }
    public static void charPattern2() {
        for (int i = 0; i <= 5; i++) {
            int alphabet = 65;
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print((char) (alphabet + k) + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }
    public static void charPattern() {
        for (int i = 5; i >= 0; i--) {
            int alphabet = 65;
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }
        for (int i = 0; i <= 5; i++) {
            int alphabet = 65;
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }
    public static void numberPattern4() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }
    public static void numberPattern3() {
        for (int i = 1; i <= 4; i++) {
            int n = 4;
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
        for (int i = 3; i >= 1; i--) {
            int n = 3;
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }
    public static void numberPattern() {
        int i, j, k = 1;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j < i + 1; j++) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }
    public static void numberPattern2() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            int number = 1;
            System.out.printf("%" + (n - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }
    public static void pyramidPattern(int n) {
        for (int i = 0; i < n; i++) // outer loop for number of rows(n)
        {
            for (int j = n - i; j > 1; j--) // inner loop for spaces
            {
                System.out.print(" "); // print space
            }
            for (int j = 0; j <= i; j++) // inner loop for number of columns
            {
                System.out.print("* "); // print star
            }
            System.out.println(); // ending line after each row
        }
        System.out.println("--------------------");
    }
}
