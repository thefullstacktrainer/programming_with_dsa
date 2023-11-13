package org.excelr.day4.data_structures;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Display the original stack
        System.out.println("Original Stack:");
        displayStack(stack);

        // Popping an element
        int poppedElement = stack.pop();
        System.out.println("\nPopped Element: " + poppedElement);

        // Display the stack after popping
        System.out.println("Stack after popping:");
        displayStack(stack);

        // Peeking at the top element
        int topElement = stack.peek();
        System.out.println("\nTop Element: " + topElement);

        // Display the stack after peeking
        System.out.println("Stack after peeking:");
        displayStack(stack);
    }

    // Method to display the elements of the stack
    private static void displayStack(Stack<Integer> stack) {
        for (int element : stack) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
