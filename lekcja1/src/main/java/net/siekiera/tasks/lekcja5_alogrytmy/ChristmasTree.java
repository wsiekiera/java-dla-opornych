package net.siekiera.tasks.lekcja5_alogrytmy;

/**
 * Christmas is comming, and your task is to build a Christmas tree with specified height.
 * The leaves shold be in n=height rows. The first row fill in 1 char, the second row fill in 3 chars, and so on.
 * Some of the necessary spaces will be added to the left side, to keep the shape of the tree.
 * No space need to be added to the right side.
 *
 * Sample outputs:
 *
 * height=1
 * *
 * |
 *
 * height=2
 *  *
 * ***
 *  |
 * 
 * height=3
 *   *
 *  ***
 * *****
 *   |
 *
 * height=5
 *      *
 *     ***
 *    *****
 *   *******
 *  *********
 *      |
 */
public class ChristmasTree {
    public String drawChristmasTree(int height) {
        String tree = "";

        for (int i = 0; i < height; i++) {
            tree += repeatString(" ", height - 1 - i) + repeatString("*", i * 2 + 1) + "\n";
        }
        tree += repeatString(" ", height - 1) + "|"; // trunk

        return tree;
    }

    public static String repeatString(String str, int times) {
        if (times <= 0) return "";
        else return str + repeatString(str, times-1);
    }
}
