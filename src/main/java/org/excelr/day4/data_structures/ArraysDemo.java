package org.excelr.day4.data_structures;

public class ArraysDemo {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {5, 10, 15, 20, 25};

        // Display the original array
        System.out.println("Original Array:");
        displayArray(numbers);

        // Accessing elements
        System.out.println("\nElement at index 2: " + numbers[2]);

        // Modifying an element
        numbers[3] = 30;
        System.out.println("Array after modifying element at index 3:");
        displayArray(numbers);

        // Finding the length of the array
        int arrayLength = numbers.length;
        System.out.println("\nLength of the array: " + arrayLength);

        // Summing the elements
        int sum = 0;
        for (int i = 0; i < arrayLength; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of elements: " + sum);

        // Displaying the array in reverse order
        System.out.println("\nArray in reverse order:");
        displayReverseArray(numbers);
    }

    // Method to display the elements of the array
    private static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method to display the elements of the array in reverse order
    private static void displayReverseArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
