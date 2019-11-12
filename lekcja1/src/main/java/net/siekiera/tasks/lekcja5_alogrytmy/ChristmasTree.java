package net.siekiera.tasks.lekcja5_alogrytmy;

/**
 * Christmas is comming, and your task is to build a Christmas tree with specified height.
 * The leaves shold be in n=height rows. The first row fill in 1 char, the second row fill in 3 chars, and so on.
 * Some of the necessary spaces will be added to the left side, to keep the shape of the tree.
 * No space need to be added to the right side.
 * <p>
 * Sample outputs:
 * <p>
 * height=1
 * *
 * |
 * <p>
 * height=2
 * *
 * ***
 * |
 * <p>
 * height=3
 * *
 * ***
 * *****
 * |
 * <p>
 * height=5
 * *
 * ***
 * *****
 * *******
 * *********
 * |
 */
public class ChristmasTree {

    public String drawChristmasTree(int height) {
        //todo implement me!

        StringBuilder choinka = new StringBuilder();

        for (int i = 0; i < height; i++) {
            for (int j = 1; j < height - i; j++) {
                choinka.append(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                choinka.append("*");
            }
            choinka.append("\n");
        }
        for (int l = 1; l <= height - 1 ; l++) {
            choinka.append(" ");
        }
        choinka.append("|");

        return choinka.toString();
    }
}
