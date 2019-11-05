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
        public static int summation(int n) {
            int suma = 0;
            for (int i = 1; i <= n; i++) suma += i;
            return suma;
        }

    public static void main(String[] args) {
        System.out.println(summation(8));
    }
}
