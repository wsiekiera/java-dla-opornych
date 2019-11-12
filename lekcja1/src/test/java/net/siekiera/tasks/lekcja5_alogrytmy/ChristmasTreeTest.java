package net.siekiera.tasks.lekcja5_alogrytmy;

import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import static org.junit.Assert.*;

public class ChristmasTreeTest {
    private ChristmasTree christmasTree;
    private String treeWithHeight1;
    private String treeWithHeight2;
    private String treeWithHeight5;


    @Before
    public void prepare() {
        christmasTree = new ChristmasTree();
        treeWithHeight1 = new StringBuilder()
                .append("*\n")
                .append("|")
                .toString();

        treeWithHeight2 = new StringBuilder()
                .append(" *\n")
                .append("***\n")
                .append(" |")
                .toString();

        treeWithHeight5 = new StringBuilder()
                .append("    *\n")
                .append("   ***\n")
                .append("  *****\n")
                .append(" *******\n")
                .append("*********\n")
                .append("    |")
                .toString();

    }

    @Test
    public void drawChristmasTree() {
        assertEquals(treeWithHeight1, christmasTree.drawChristmasTree(1));
        assertEquals(treeWithHeight2, christmasTree.drawChristmasTree(2));
        assertEquals(treeWithHeight5, christmasTree.drawChristmasTree(5));
    }
}