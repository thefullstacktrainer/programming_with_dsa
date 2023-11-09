package org.excelr.day2;

import java.util.Arrays;

public class JavaArray {
    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5 };
        int thirdElement = numbers[0]; // Accessing the third element (index 2)
        System.out.println(thirdElement);
        int arrayLength = numbers.length;
        for (int i = 0; i < arrayLength; i++) {
            // Access each element using numbers[i]
            System.out.println(numbers[i]);
        }

        // 1. ArraySum
        numbers = new int[] { 1, 2, 3, 4, 5 };
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Sum of array elements: " + sum);

        // 2. Finding the Maximum Element in an Array:
        numbers = new int[] { 8, 2, 5, 1, 9, 4 };
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum element: " + max);
    }
}
