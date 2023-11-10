package org.excelr.day3;

import java.util.Random;

public class ArraySummationComparison {
    public static void main(String[] args) {
        // Small array (size: 100)
        int[] smallArray = generateRandomArray(100);
        measureTimeAndPrintResult("Small Array", smallArray);

        // Medium array (size: 1,000)
        int[] mediumArray = generateRandomArray(1_000);
        measureTimeAndPrintResult("Medium Array", mediumArray);

        // Large array (size: 10,000)
        int[] largeArray = generateRandomArray(10_000);
        measureTimeAndPrintResult("Large Array", largeArray);
    }

    private static void measureTimeAndPrintResult(String arrayType, int[] array) {
        long startTime = System.nanoTime();
        int sum = sumArray(array);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println(arrayType + ": Time taken for array summation - " + duration + " nanoseconds");
    }

    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // Filling array with random numbers between 0 and 99
        }
        return array;
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}