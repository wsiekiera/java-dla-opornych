package net.siekiera.tasks.lekcja4;

import java.util.Scanner;

public class Main {
    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Utils main = new Utils();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication();
        } else {
            computation = new Addition();
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {
        System.out.println("Should multiply?");
        if (scanner.nextLine().equals("y")) return true;
        return false;
    }

    private double getArgument() {
        System.out.println("Get argument");
        return scanner.nextInt();
    }
}

