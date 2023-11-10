package org.excelr.day3.time_complexity;

public class BookExample {
    public static void main(String[] args) {
        String[] topics = {"Introduction", "Chapter 1", "Chapter 2", "Conclusion"};

        // Accessing an element in the array (like finding a topic in the book)
        String topic = findTopic(topics, 2);

        System.out.println("Topic at index 2: " + topic);
    }

    private static String findTopic(String[] array, int index) {
        // O(1) time complexity: Directly access the element at the specified index
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            return "Topic not found";
        }
    }
}
