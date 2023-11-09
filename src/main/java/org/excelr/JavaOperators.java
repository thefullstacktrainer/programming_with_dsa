package org.excelr;

public class JavaOperators {
        public static void main(String[] args) {
                int count = 0;
                // Operators
                int result = 10 + 6;
                System.out.println(result);
                boolean isTrue = (result > 15) && (count < 5);
                System.out.println(isTrue);

                // Arithmetic Operators:
                // These operators perform basic mathematical operations.
                float a = 26f;
                float b = 5f;
                float sum = a + b; // Addition
                float difference = a - b; // Subtraction
                float product = a * b; // Multiplication
                float quotient = a / b; // Division
                float remainder = a % b; // Modulus (remainder after division)
                System.out.println("sum = " + sum + " difference = " + difference + " product = " + product);
                System.out.println("quotient = " + quotient + " remainder = " + remainder);
                double d = 10;
                System.out.println(d);

                // Relational Operators:
                // Relational operators compare two values and return a boolean result.
                int x = 20;
                int y = 20;
                boolean isEqual = x == y; // Equal to
                boolean isNotEqual = x != y; // Not equal to
                boolean isGreater = x > y; // Greater than
                boolean isLess = x < y; // Less than
                boolean isGreaterOrEqual = x >= y; // Greater than or equal to
                boolean isLessOrEqual = x <= y; // Less than or equal to
                System.out.println(isGreaterOrEqual);
                System.out.println(isLessOrEqual);

                // Logical Operators:
                // Logical operators perform logical operations and return a boolean result.
                boolean p = true;
                boolean q = true;
                boolean r = true;
                boolean andResult = p && q; // Logical AND
                boolean orResult = p || q || r; // Logical OR
                boolean notResult = !q; // Logical NOT
                System.out.println(andResult);
                System.out.println(orResult);
                System.out.println(notResult);

                // Assignment Operators:
                // Assignment operators are used to assign values to variables.

                int num = 10;
                num += 5; // Equivalent to: num = num + 5;
                System.out.println(num);
                num -= 3; // Equivalent to: num = num - 3;
                System.out.println(num);
                num *= 2; // Equivalent to: num = num * 2;
                System.out.println(num);
                num /= 4; // Equivalent to: num = num / 4;
                System.out.println(num);
                num %= 3; // Equivalent to: num = num % 3;
                System.out.println(num);

                // Increment and Decrement Operators:
                // Increment and decrement operators are used to increase or decrease the value
                // of a variable by 1.
                count = 5;
                System.out.println(count);
                count++; // Increment by 1
                System.out.println(count);
                count--; // Decrement by 1
                System.out.println(count);

                // Conditional Operator (Ternary Operator):
                // This is a shorthand way of writing an if-else statement.
                int a1 = 10;
                int b1 = 50;
                int max = (a1 < b1) ? a1 : b1; // If a is greater than b, max = a; else, max = b;
                System.out.println(max);

                // Bitwise Operators:
                // Bitwise operators perform operations at the bit level.
                int x1 = 5; // Binary: 0101
                int y1 = 3; // Binary: 0011

                int andResult1 = x1 & y1; // Bitwise AND (result: 0001)
                int orResult1 = x | y; // Bitwise OR (result: 0111)
                int xorResult = x ^ y; // Bitwise XOR (result: 0110)
                int complementResult = ~x; // Bitwise Complement (result: 1111 1111 1111 1111 1111 1111 1111 1010)

                // Shift Operators:
                // Shift operators shift the bits of a number to the left or right.
                int num2 = 8; // Binary: 1000

                int leftShiftResult = num2 << 1; // Left shift by 1 (result: 16, Binary: 10000)
                int rightShiftResult = num2 >> 1; // Right shift by 1 (result: 4, Binary: 100)

        }
}
