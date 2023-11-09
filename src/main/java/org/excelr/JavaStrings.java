package org.excelr;

public class JavaStrings {
    public static void main(String[] args) {
        String greeting = "Hello, Coders!";
        System.out.println(greeting);
        // Finding the Length of a String:
        int length = greeting.length(); // Length of the string
        String upperCase = greeting.toUpperCase(); // Convert to uppercase
        String lowerCase = greeting.toLowerCase(); // Convert to lowercase

        System.out.println(length);
        System.out.println(upperCase);
        System.out.println(lowerCase);

        // Concatenating Two Strings:
        String firstName = "M S";
        String lastName = "Dhoni";
        String fullName = firstName + " " + lastName; // Using +
        System.out.println(fullName);

        String str1 = "Hello";
        String str2 = "hello";
        boolean isEqual = str1.equals(str2); // Case-sensitive comparison
        System.out.println(isEqual);
        String sub = greeting.substring(0, 5); // Extracts "Hello"
        System.out.println(sub);

    }
}
