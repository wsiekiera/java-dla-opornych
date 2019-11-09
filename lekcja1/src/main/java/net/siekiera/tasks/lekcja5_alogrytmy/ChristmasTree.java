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
        //todo implement me!
        StringBuilder christmasTree = new StringBuilder();
        int row;
        for (int i = 1; i <= height; i++) {
            for (row = 1; row <= height - i; row++) christmasTree.append(" ");
            for (row = 1; row <= 2 * i - 1; row++) christmasTree.append("*");
            christmasTree.append("\n");
        }
        for (int i = 1; i < height; i++) christmasTree.append(" ");
        christmasTree.append("|");

        return christmasTree.toString();
    }
}
