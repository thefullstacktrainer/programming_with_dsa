package org.excelr.day3;

import java.util.Arrays;

public class LinearSpaceExample {
    public static void main(String[] args) {
        // Linear space complexity - O(n)
        int[] inputArray = {1, 2, 3, 4, 5};
        int[] resultArray = duplicateArray(inputArray);

        System.out.println("Original Array: " + Arrays.toString(inputArray));
        System.out.println("Duplicated Array: " + Arrays.toString(resultArray));
    }

    private static int[] duplicateArray(int[] arr) {
        // Additional space used for duplicated array
        int[] newArr = Arrays.copyOf(arr, arr.length);
        return newArr;
    }
}
