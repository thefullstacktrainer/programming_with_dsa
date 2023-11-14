package org.excelr.day5;

public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index of the target element
            }
        }
        return -1; // Return -1 if the target element is not found in the array
    }

    public static void main(String[] args) {
        int[] myArray = {2, 8, 15, 23, 16, 42, 7};

        int targetElement = 16;
        int result = linearSearch(myArray, targetElement);

        if (result != -1) {
            System.out.println("Element " + targetElement + " found at index " + result);
        } else {
            System.out.println("Element " + targetElement + " not found in the array");
        }
    }
}
