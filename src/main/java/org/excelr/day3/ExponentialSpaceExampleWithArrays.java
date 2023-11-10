package org.excelr.day3;

public class ExponentialSpaceExampleWithArrays {
    public static void main(String[] args) {
        char[] set = {'a', 'b', 'c'};
        generateAllSubsets(set, 0, "");
    }

    private static void generateAllSubsets(char[] set, int index, String currentSubset) {
        if (index == set.length) {
            // Base case: Print the current subset
            System.out.println("Subset: " + currentSubset);
            return;
        }

        // Exclude the current element
        generateAllSubsets(set, index + 1, currentSubset);

        // Include the current element
        generateAllSubsets(set, index + 1, currentSubset + set[index]);
    }
}
