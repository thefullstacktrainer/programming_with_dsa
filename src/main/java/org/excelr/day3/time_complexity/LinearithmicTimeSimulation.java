package org.excelr.day3.time_complexity;

import java.util.Arrays;

public class LinearithmicTimeSimulation {
    // Simulated array of integers
    private static int[] numbers = {5, 2, 9, 1, 5, 6};

    // Simulated sort function with O(n log n) time complexity
    private static void mergeSort(int[] array, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);
            merge(array, low, mid, high);
        }
    }

    // Helper function to merge two sorted halves of an array
    private static void merge(int[] array, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copy data to temporary arrays left[] and right[]
        for (int i = 0; i < n1; ++i) {
            left[i] = array[low + i];
        }
        for (int j = 0; j < n2; ++j) {
            right[j] = array[mid + 1 + j];
        }

        // Merge the temporary arrays back into the original array
        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of left[], if any
        while (i < n1) {
            array[k] = left[i];
            i++;
            k++;
        }

        // Copy remaining elements of right[], if any
        while (j < n2) {
            array[k] = right[j];
            j++;
            k++;
        }
    }

    // Main method to demonstrate the simulation
    public static void main(String[] args) {
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // Simulate sorting operation with O(n log n) time complexity
        mergeSort(numbers, 0, numbers.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }
}
