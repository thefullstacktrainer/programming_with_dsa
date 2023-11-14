package org.excelr.day5;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; // Return the index of the target element
            } else if (arr[mid] > target) {
                high = mid - 1; // Adjust the high pointer
            } else {
                low = mid + 1; // Adjust the low pointer
            }
        }

        return -1; // Return -1 if the target element is not found in the array
    }

    public static void main(String[] args) {
        int[] myArray = {2, 7, 16, 23, 42, 55, 78};
        int targetElement = 23;

        int result = binarySearch(myArray, targetElement);

        if (result != -1) {
            System.out.println("Element " + targetElement + " found at index " + result);
        } else {
            System.out.println("Element " + targetElement + " not found in the array");
        }
    }
}
