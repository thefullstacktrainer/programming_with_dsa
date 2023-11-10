package org.excelr.day3.space_complexity;

import java.util.Arrays;

public class QuadraticSpaceSimulation {
    // Simulated 2D array (matrix)
    private static int[][] matrix;

    // Simulated function with O(n^2) space complexity
    private static void createMatrix(int rows, int cols) {
        matrix = new int[rows][cols];

        // Initialize the matrix with values
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = i * cols + j + 1;
            }
        }
    }

    // Main method to demonstrate the simulation
    public static void main(String[] args) {
        int numRows = 3;
        int numCols = 3;

        // Simulate creating a matrix with O(n^2) space complexity
        createMatrix(numRows, numCols);

        // Print the resulting matrix
        System.out.println("Simulated 2D Array (Matrix):");
        for (int i = 0; i < numRows; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
