package org.excelr.day3;

import java.util.Arrays;

public class JavaArrayPrograms {
    public static void main(String[] args) {

        // 3. Reversing an Array:
        int[] numbers = new int[] { 1, 2, 3, 4, 5 };
        int[] reversed = new int[numbers.length];

        for (int i = 0, j = numbers.length - 1; i < numbers.length; i++, j--) {
            reversed[i] = numbers[j];
        }

        System.out.print("Reversed array: ");
        for (int num : reversed) {
            System.out.print(num + " ");
        }

        // 4. Checking for Duplicate Elements:
        numbers = new int[] { 1, 2, 3, 4, 2, 5 };

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println("Duplicate found: " + numbers[i]);
                }
            }
        }

        // 5. Finding the Average of Array Elements:
        numbers = new int[] { 10, 5, 8, 2, 7 };
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        double average = (double) sum / numbers.length;
        System.out.println("Average of array elements: " + average);

        // 6. Removing Duplicates from an Array:
        numbers = new int[] { 1, 2, 3, 4, 2, 5 };
        int length = numbers.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (numbers[i] == numbers[j]) {
                    numbers[j] = numbers[length - 1];
                    length--;
                    j--;
                }
            }
        }

        int[] uniqueArray = Arrays.copyOf(numbers, length);
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }
}
