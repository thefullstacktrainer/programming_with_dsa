package org.excelr.day4.data_structures;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        // Create a queue of integers
        Queue<Integer> queue = new LinkedList<>();

        // Enqueuing elements into the queue
        queue.add(5);
        queue.add(10);
        queue.add(15);

        // Display the original queue
        System.out.println("Original Queue:");
        displayQueue(queue);

        // Dequeuing an element
        int dequeuedElement = queue.poll();
        System.out.println("\nDequeued Element: " + dequeuedElement);

        // Display the queue after dequeuing
        System.out.println("Queue after dequeuing:");
        displayQueue(queue);

        // Enqueuing another element
        queue.offer(20);

        // Display the updated queue
        System.out.println("\nQueue after enqueuing:");
        displayQueue(queue);

        // Peeking at the front element
        int frontElement = queue.peek();
        System.out.println("\nFront Element: " + frontElement);

        // Display the queue after peeking
        System.out.println("Queue after peeking:");
        displayQueue(queue);
    }

    // Method to display the elements of the queue
    private static void displayQueue(Queue<Integer> queue) {
        for (int element : queue) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
