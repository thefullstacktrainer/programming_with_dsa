package org.excelr.day3.time_complexity;
import java.util.Arrays;

public class QuadraticTimeSimulation {
    // Simulated array of integers
    private static int[] numbers = {5, 2, 9, 1, 5, 6};

    // Simulated function with O(n^2) time complexity
    private static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Main method to demonstrate the simulation
    public static void main(String[] args) {
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // Simulate sorting operation with O(n^2) time complexity (Bubble Sort)
        bubbleSort(numbers);

        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }
}
