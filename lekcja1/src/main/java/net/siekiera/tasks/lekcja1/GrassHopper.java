package net.siekiera.tasks.lekcja1;

/**
 * https://www.codewars.com/kata/grasshopper-summation/train/java
 * Write a program that finds the summation of every number from 1 to num.
 * The number will always be a positive integer greater than 0.
 *
 * Examples:
 * summation(2) -> 3
 * 1 + 2
 *
 * summation(8) -> 36
 * 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8
 */
public class GrassHopper {
        public static int summationAlt(int n) {
            if(n % 2 == 0) {
                return (n / 2) * (1 + n);
            } else {
                return ((n - 1) / 2) * (1 + n) + ((n + 1) / 2);
            }
        }

        public static int summationAlt1(int n) {
            int counter = 1;
            int sum = 0;
            while ( counter <= n) {
                sum += counter;
                counter++;
            }
            return sum;
        }

        public static int summation(int n) {
            if (n == 1) {
                return 1;
            }
            return summation(n-1) + n;
        }

}
