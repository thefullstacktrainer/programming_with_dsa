package org.excelr;

public class JavaControlStructures {
    public static void main(String[] args) {
        // Control Flow
        // Java has various control flow structures like if, else, switch, for, while,
        // and do-while.

        // if Statement:
        // The if statement is used for conditional execution.
        // If the specified condition is true, the block of code inside the if statement
        // is executed.

        int age = 32;

        if (age >= 18) {
            System.out.println("You are an adult.");
        }
        System.out.println("Other part");

        // if-else Statement:
        // The if-else statement allows you to execute one block of code if the
        // condition is true and
        // another block if the condition is false.

        age = 25;

        if (age >= 18) {
            System.out.println("You are an adult & you can vote");
        } else {
            System.out.println("You are a minor.");
        }

        // if-else if-else Statement:
        // The if-else if-else statement allows you to check multiple conditions and
        // execute different blocks of code accordingly.
        int score = 79;

        if (score >= 90) {
            System.out.println("Excellent!");
        } else if (score >= 80) {
            System.out.println("Good job!");
        } else {
            System.out.println("Keep it up!");
        }

        // switch Statement:
        // The switch statement is used to select one of many code blocks to be
        // executed.
        int day = 4;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                System.out.println("Day is: " + dayName);
                break;
            case 2:
                dayName = "Tuesday";
                System.out.println("Day is: " + dayName);
                break;
            case 3:
                dayName = "Wednesday";
                System.out.println("Day is: " + dayName);
                break;
            case 4:
                dayName = "Thursday";
                System.out.println("Day is: " + dayName);
                break;
            case 5:
                dayName = "Friday";
                System.out.println("Day is: " + dayName);
                break;
            default:
                dayName = "It's Weekend Hurrah....!!";
                System.out.println("Day is: " + dayName);
        }

        System.out.println("Hello");

        // while Loop:
        // The while loop is used to repeatedly execute a block of code as long as the
        // specified condition is true.
        int count = 10;

        while (count < 5) {
            System.out.println("Count: " + count);
            count++; // 5
        }
        System.out.println("test");

        // do-while Loop:
        // The do-while loop is similar to the while loop,
        // but it guarantees that the block of code is executed at least once before
        // checking the condition.

        count = 0;

        do {
            System.out.println("Count: " + count);
            count++;
        } while (count < 5);

        // for Loop:
        // The for loop provides a concise way to iterate over a range of values.
        for (int i = 0; i < 5; i++) {
            System.out.println("Index: " + i);
        }

        // Enhanced for Loop (foreach):
        // The enhanced for loop is used for iterating over elements of an array or a
        // collection.
        int[] numbers = { 1, 2, 3, 4, 5 };

        for (int num : numbers) {
            System.out.println("Number: " + num);
        }

        // break Statement:
        // The break statement is used to exit a loop prematurely.
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("Index: " + i);
        }
        // continue Statement:
        // The continue statement is used to skip the rest of the code inside a loop and
        // move to the next iteration.
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("Index: " + i);
        }

    }
}
