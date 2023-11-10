package org.excelr.day3.time_complexity;

import java.util.Arrays;

public class CubicTimeSimulation {
    // Simulated 2D array (matrix)
    private static int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    // Simulated function with O(n^3) time complexity
    private static void matrixMultiplication(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < cols; k++) {
                    result[i][j] += matrix[i][k] * matrix[k][j];
                }
            }
        }

        // Print the resulting matrix
        System.out.println("Matrix Multiplication Result:");
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }

    // Main method to demonstrate the simulation
    public static void main(String[] args) {
        // Simulate matrix multiplication operation with O(n^3) time complexity
        matrixMultiplication(matrix);
    }
}
