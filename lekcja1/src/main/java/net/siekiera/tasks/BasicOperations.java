package net.siekiera.tasks;

/**
 * https://www.codewars.com/kata/basic-mathematical-operations/train/java
 * Your task is to create a function that does four basic mathematical operations.
 *
 * The function should take three arguments - operation(string/char), value1(number), value2(number).
 * The function should return result of numbers after applying the chosen operation.
 *
 * Examples:
 * basicOp('+', 4, 7)         // Output: 11
 * basicOp('-', 15, 18)       // Output: -3
 * basicOp('*', 5, 5)         // Output: 25
 * basicOp('/', 49, 7)        // Output: 7
 */
public class BasicOperations {
        public static int basicMath(String op, int v1, int v2)
        {
            switch (op) {
                case "+":
                    return v1+v2;
                case "-":
                    return v1-v2;
                case "*":
                    return v1 * v2;
                case "/":
                    return v1/v2;
                default:
                    throw new IllegalArgumentException();

            }
        }
}
