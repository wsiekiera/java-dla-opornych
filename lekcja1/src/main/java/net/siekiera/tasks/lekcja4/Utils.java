package net.siekiera.tasks.lekcja4;

import java.util.Scanner;

public class Utils {
    private Scanner scanner = new Scanner(System.in);
    public boolean shouldMultiply() {
        System.out.println("Should multiply?");
        if (scanner.nextLine().equals("y")) return true;
        return false;
    }

    public double getArgument() {
        System.out.println("Get argument");
        return scanner.nextInt();
    }
}
