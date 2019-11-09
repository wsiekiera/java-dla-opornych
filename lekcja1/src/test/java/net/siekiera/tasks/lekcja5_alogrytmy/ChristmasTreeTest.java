package net.siekiera.tasks.lekcja5_alogrytmy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChristmasTreeTest {
    private ChristmasTree christmasTree;
    private String treeSize1;
    private String treeSize2;
    private String treeSize5;


    @Before
    public void prepare() {
        christmasTree = new ChristmasTree();
        treeSize1 = "*";

        treeSize2 = new StringBuilder()
                .append(" * \n")
                .append("***")
                .toString();

        treeSize5 = new StringBuilder()
                .append("   *   \n")
                .append("  ***  \n")
                .append(" ***** \n")
                .append(" ******* \n")
                .append("*********")
                .toString();

    }

    @Test
    public void drawChristmasTree() {
        assertEquals(treeSize1, christmasTree.drawChristmasTree(1));
        assertEquals(treeSize1, christmasTree.drawChristmasTree(2));
        assertEquals(treeSize1, christmasTree.drawChristmasTree(5));
    }
}