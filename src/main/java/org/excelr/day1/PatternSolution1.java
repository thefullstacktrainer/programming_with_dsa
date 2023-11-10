package org.excelr.day1;

public class PatternSolution1 {
    public static void main(String[] args) {
        // Pattern 1
        for (int i = 0; i < 5; i++) {
            System.out.print("* ");
        }
        System.out.println();
        System.out.println("--------------------");
        // Pattern 2
        for (int i = 0; i < 5; i++) {
            System.out.println("* ");
        }
        System.out.println("--------------------");
        // Pattern 3
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
        // Pattern 4 Increasing Triangle Pattern
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
        // Pattern 5 Decreasing Triangle Pattern
        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
        // Pattern 6 Right Sided Triangle Pattern
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------");
        // Pattern 7 Right Sided Triangle Pattern
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
