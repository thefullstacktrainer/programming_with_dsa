package org.excelr.day3;

public class JavaStringsPrograms {
        public static void main(String[] args) {

                // 1. Checking for Palindrome:
                String word = "level";
                String reversed = "";

                for (int i = word.length() - 1; i >= 0; i--) {
                        reversed += word.charAt(i);
                }

                boolean isPalindrome = word.equals(reversed);
                System.out.println("Is palindrome? " + isPalindrome);

                // 2.Counting Vowels and Consonants:
                String text = "Programming in Java";
                int vowelCount = 0;
                int consonantCount = 0;

                for (char ch : text.toLowerCase().toCharArray()) {
                        if (Character.isLetter(ch)) {
                                if ("aeiou".contains(String.valueOf(ch))) {
                                        vowelCount++;
                                } else {
                                        consonantCount++;
                                }
                        }
                }

                System.out.println("Vowels: " + vowelCount);
                System.out.println("Consonants: " + consonantCount);

                // 3.Reversing a String:
                String original = "Java Programming";
                StringBuilder result = new StringBuilder();

                for (int i = original.length() - 1; i >= 0; i--) {
                        result.append(original.charAt(i));
                }

                System.out.println("Reversed string: " + result.toString());

                // 4. Finding Substring Occurrences:
                String text2 = "Java is a popular programming language. Java is versatile.";
                String substring = "Java";
                int count = 0;
                int index = text2.indexOf(substring);

                while (index != -1) {
                        count++;
                        index = text2.indexOf(substring, index + 1);
                }

                System.out.println("Occurrences of \"" + substring + "\": " + count);

        }
}
