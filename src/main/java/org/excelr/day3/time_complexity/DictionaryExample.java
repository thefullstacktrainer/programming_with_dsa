package org.excelr.day3.time_complexity;

public class DictionaryExample {
    public static void main(String[] args) {
        String[] dictionary = {"apple", "banana", "cherry", "date", "grape", "kiwi"};

        // Searching for a word in the dictionary (like binary search)
        int index = binarySearch(dictionary, "date");

        System.out.println("Index of 'date': " + index);
    }

    private static int binarySearch(String[] array, String target) {
        // O(log n) time complexity: Binary search
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = target.compareTo(array[mid]);

            if (comparison == 0) {
                return mid;  // Found the target
            } else if (comparison < 0) {
                high = mid - 1;  // Target is in the lower half
            } else {
                low = mid + 1;  // Target is in the upper half
            }
        }

        return -1;  // Target not found
    }
}
