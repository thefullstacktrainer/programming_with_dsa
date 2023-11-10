package org.excelr.day3.time_complexity;

public class ConstantTimeExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Example of O(1) time complexity: Accessing an element in an array by index
        int result = getElementAtIndex(numbers, 2);

        System.out.println("Element at index 2: " + result);
    }

    private static int getElementAtIndex(int[] array, int index) {
        // O(1) time complexity: Accessing an element in an array
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            System.out.println("Index out of bounds");
            return -1;
        }
    }
}
