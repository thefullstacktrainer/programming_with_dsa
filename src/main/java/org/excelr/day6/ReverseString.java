package org.excelr.day6;

public class ReverseString {

    public static String reverseString(String input) {
        char[] charArray = input.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            // Swap characters at start and end indices
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move pointers
            start++;
            end--;
        }

        // Convert back to string
        return new String(charArray);
    }

    public static void main(String[] args) {
        String originalString = "Hello, World!";
        System.out.println("Original String: " + originalString);

        String reversedString = reverseString(originalString);
        System.out.println("Reversed String: " + reversedString);
    }
}
